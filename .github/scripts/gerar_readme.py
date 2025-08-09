import os

# Extensões consideradas código
code_extensions = ['.java', '.py', '.cpp', '.c', '.js']

base_folder = 'beecrowd'
readme_path = os.path.join(base_folder, 'README.md')

# Pega todas as pastas numeradas dentro de beecrowd/
exercise_folders = [
    f for f in os.listdir(base_folder)
    if os.path.isdir(os.path.join(base_folder, f)) and f.isdigit()
]
exercise_folders = sorted(exercise_folders, key=lambda x: int(x))

# Início do README
readme_lines = [
    '# Exercícios Beecrowd\n\n',
    '| Exercício | Link do Problema | Soluções |\n',
    '|-----------|------------------|----------|\n'
]

for folder in exercise_folders:
    folder_path = os.path.join(base_folder, folder)
    code_files = [
        file for file in os.listdir(folder_path)
        if os.path.splitext(file)[1] in code_extensions
    ]

    if not code_files:
        # Se não há código, ainda podemos mostrar a linha com aviso
        readme_lines.append(
            f'| {folder} | [Problema](https://www.beecrowd.com.br/judge/pt/problems/view/{folder}) | _Sem solução_ |\n'
        )
        continue

    solution_links = []
    for code_file in code_files:
        ext = os.path.splitext(code_file)[1].replace('.', '').upper()
        file_link = f'{folder}/{code_file}'  # relativo à pasta beecrowd
        solution_links.append(f'[{ext}]({file_link})')

    solutions_str = ' '.join(solution_links)
    readme_lines.append(
        f'| {folder} | [Problema](https://www.beecrowd.com.br/judge/pt/problems/view/{folder}) | {solutions_str} |\n'
    )

# Escreve o README
with open(readme_path, 'w', encoding='utf-8') as f:
    f.writelines(readme_lines)

print(f'✅ README gerado com {len(readme_lines)-3} exercícios listados.')
