import os

# Extensões consideradas código
code_extensions = ['.java', '.py', '.cpp', '.c', '.js']

base_folder = 'beecrowd'
readme_path = os.path.join(base_folder, 'README.md')

# Pega todas as pastas numeradas em beecrowd/
exercise_folders = [f for f in os.listdir(base_folder) if os.path.isdir(os.path.join(base_folder, f)) and f.isdigit()]
exercise_folders = sorted(exercise_folders, key=lambda x: int(x))

# Começa o conteúdo do README
readme_lines = [
    '# Exercícios Beecrowd\n',
    '| Exercício | Link do Problema | Soluções |\n',
    '|-----------|------------------|----------|\n'
]

for folder in exercise_folders:
    folder_path = os.path.join(base_folder, folder)
    # Filtra arquivos de código
    code_files = [file for file in os.listdir(folder_path) if os.path.splitext(file)[1] in code_extensions]

    if not code_files:
        # Pula pastas sem código
        continue

    # Link para o problema no beecrowd
    problem_link = f'https://www.beecrowd.com.br/judge/pt/problems/view/{folder}'

    # Links para as soluções (apenas nome do arquivo, com link para o arquivo no repo)
    solution_links = []
    for code_file in code_files:
        # Link relativo para o arquivo
        file_link = f'./{folder}/{code_file}'
        # Exibe só a extensão maiúscula como label
        ext = os.path.splitext(code_file)[1].replace('.', '').upper()
        solution_links.append(f'[{ext}]({file_link})')

    # Junta os links das soluções separados por espaço
    solutions_str = ' '.join(solution_links)

    # Monta a linha da tabela
    readme_lines.append(f'| {folder} | [Problema]({problem_link}) | {solutions_str} |\n')

# Escreve no README.md
with open(readme_path, 'w', encoding='utf-8') as f:
    f.writelines(readme_lines)

print(f'Readme gerado com {len(readme_lines)-3} exercícios resolvidos.')
