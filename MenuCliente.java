package Interface_grafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuCliente {

    public MenuCliente() {
        // Criando o frame do menu do cliente
        JFrame frame = new JFrame("Menu Cliente - Banco Malvader");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setLocationRelativeTo(null);

        // Painel para os botões do menu
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1, 10, 10));

        // Botões das operações de conta
        JButton saldoButton = new JButton("Consultar Saldo");
        JButton depositoButton = new JButton("Depósito");
        JButton saqueButton = new JButton("Saque");
        JButton extratoButton = new JButton("Consultar Extrato");
        JButton limiteButton = new JButton("Consultar Limite");
        JButton sairButton = new JButton("Sair");

        // Adicionando ação para cada botão
        saldoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String senha = JOptionPane.showInputDialog(frame, "Digite sua senha:");
                if (validarSenha(senha)) {
                    JOptionPane.showMessageDialog(frame, "Seu saldo é de: R$1000.00");
                    // Aqui você pode implementar a lógica para consultar e exibir o saldo real
                } else {
                    JOptionPane.showMessageDialog(frame, "Senha incorreta.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        depositoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String valor = JOptionPane.showInputDialog(frame, "Digite o valor para depósito:");
                JOptionPane.showMessageDialog(frame, "Depósito de R$" + valor + " realizado com sucesso.");
                // Aqui você pode implementar a lógica para realizar o depósito
            }
        });

        saqueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String senha = JOptionPane.showInputDialog(frame, "Digite sua senha:");
                if (validarSenha(senha)) {
                    String valor = JOptionPane.showInputDialog(frame, "Digite o valor para saque:");
                    // Lógica para verificar saldo e realizar saque pode ser adicionada aqui
                    JOptionPane.showMessageDialog(frame, "Saque de R$" + valor + " realizado com sucesso.");
                } else {
                    JOptionPane.showMessageDialog(frame, "Senha incorreta.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        extratoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Exibindo extrato...");
                // Aqui você pode implementar a lógica para exibir o extrato e exportá-lo para
                // Excel
            }
        });

        limiteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String senha = JOptionPane.showInputDialog(frame, "Digite sua senha:");
                if (validarSenha(senha)) {
                    JOptionPane.showMessageDialog(frame, "Seu limite disponível é de: R$500.00");
                    // Aqui você pode implementar a lógica para consultar e exibir o limite real
                } else {
                    JOptionPane.showMessageDialog(frame, "Senha incorreta.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        sairButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Fecha o menu do cliente e encerra o programa
            }
        });

        // Adicionando botões ao painel
        panel.add(saldoButton);
        panel.add(depositoButton);
        panel.add(saqueButton);
        panel.add(extratoButton);
        panel.add(limiteButton);
        panel.add(sairButton);

        // Adicionando o painel ao frame
        frame.add(panel);
        frame.setVisible(true);
    }

    // Método auxiliar para validar a senha (temporário)
    private boolean validarSenha(String senha) {
        // A validação pode ser implementada para verificar a senha real do cliente
        return senha != null && senha.equals("12345"); // Exemplo temporário: senha fixa
    }
}