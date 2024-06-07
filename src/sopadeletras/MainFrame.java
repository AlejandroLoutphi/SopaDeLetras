/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sopadeletras;

import datastructures.LinkedList;
import datastructures.AdjacencyMatrixGraph;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import java.io.File;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.Timer;
import static javax.swing.SwingConstants.CENTER;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ayahzaheraldeen
 * @author Alejandro Loutphi
 * @author luciano2777
 */
public class MainFrame extends javax.swing.JFrame {
    private boolean[][] adjacencyMatrix;
    private Timer timer;
    private long startTime;
    private AdjacencyMatrixGraph<Character> graphA;

    /**
     * Creates new form MainFrame3
     */
    public MainFrame() {
        initComponents();
        JLabel[] labels = { jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, jLabel10,
                jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16 };
        for (JLabel label : labels) {
            label.setVisible(false);
        }
        this.DictionaryTextArea.setEditable(true);
        jLabel1.setHorizontalAlignment(CENTER);
        jLabel2.setHorizontalAlignment(CENTER);
        jLabel3.setHorizontalAlignment(CENTER);
        jLabel4.setHorizontalAlignment(CENTER);
        jLabel5.setHorizontalAlignment(CENTER);
        jLabel6.setHorizontalAlignment(CENTER);
        jLabel7.setHorizontalAlignment(CENTER);
        jLabel8.setHorizontalAlignment(CENTER);
        jLabel9.setHorizontalAlignment(CENTER);
        jLabel10.setHorizontalAlignment(CENTER);
        jLabel11.setHorizontalAlignment(CENTER);
        jLabel12.setHorizontalAlignment(CENTER);
        jLabel13.setHorizontalAlignment(CENTER);
        jLabel14.setHorizontalAlignment(CENTER);
        jLabel15.setHorizontalAlignment(CENTER);
        jLabel16.setHorizontalAlignment(CENTER);
        this.adjacencyMatrix = new boolean[16][16];
        initializeTimer();
    }

    private void initializeTimer() {
        timer = new Timer(100, e -> {
            long elapsedTime = System.currentTimeMillis() - startTime;
            TimeLabel.setText("Tiempo: " + elapsedTime + "ms");
        });
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
        timer.start();
    }

    private void stopTimer() {
        timer.stop();
    }

    private void resetTimer() {
        timer.stop();
        TimeLabel.setText("Tiempo: 0ms");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DictionaryTextArea = new javax.swing.JTextArea();
        SaveButton = new javax.swing.JButton();
        InputWord = new javax.swing.JTextField();
        TimeLabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        LoadButton = new javax.swing.JButton();
        FindWordButton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TimeLabel1 = new javax.swing.JLabel();

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("October Condensed Devanagari", 1, 18)); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));
        jLabel1.setMaximumSize(new java.awt.Dimension(44, 44));
        jLabel1.setMinimumSize(new java.awt.Dimension(44, 44));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 50, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("October Condensed Devanagari", 1, 18)); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));
        jLabel2.setMaximumSize(new java.awt.Dimension(44, 44));
        jLabel2.setMinimumSize(new java.awt.Dimension(44, 44));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 50, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("October Condensed Devanagari", 1, 18)); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));
        jLabel3.setMaximumSize(new java.awt.Dimension(44, 44));
        jLabel3.setMinimumSize(new java.awt.Dimension(44, 44));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 50, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("October Condensed Devanagari", 1, 18)); // NOI18N
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));
        jLabel4.setMaximumSize(new java.awt.Dimension(44, 44));
        jLabel4.setMinimumSize(new java.awt.Dimension(44, 44));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 50, 40));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("October Condensed Devanagari", 1, 18)); // NOI18N
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));
        jLabel5.setMaximumSize(new java.awt.Dimension(44, 44));
        jLabel5.setMinimumSize(new java.awt.Dimension(44, 44));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 50, 40));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("October Condensed Devanagari", 1, 18)); // NOI18N
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));
        jLabel6.setMaximumSize(new java.awt.Dimension(44, 44));
        jLabel6.setMinimumSize(new java.awt.Dimension(44, 44));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 50, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("October Condensed Devanagari", 1, 18)); // NOI18N
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));
        jLabel7.setMaximumSize(new java.awt.Dimension(44, 44));
        jLabel7.setMinimumSize(new java.awt.Dimension(44, 44));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 50, 40));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("October Condensed Devanagari", 1, 18)); // NOI18N
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));
        jLabel8.setMaximumSize(new java.awt.Dimension(44, 44));
        jLabel8.setMinimumSize(new java.awt.Dimension(44, 44));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 50, 40));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("October Condensed Devanagari", 1, 18)); // NOI18N
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));
        jLabel9.setMaximumSize(new java.awt.Dimension(44, 44));
        jLabel9.setMinimumSize(new java.awt.Dimension(44, 44));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 50, 40));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("October Condensed Devanagari", 1, 18)); // NOI18N
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));
        jLabel10.setMaximumSize(new java.awt.Dimension(44, 44));
        jLabel10.setMinimumSize(new java.awt.Dimension(44, 44));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 50, 40));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("October Condensed Devanagari", 1, 18)); // NOI18N
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));
        jLabel11.setMaximumSize(new java.awt.Dimension(44, 44));
        jLabel11.setMinimumSize(new java.awt.Dimension(44, 44));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 50, 40));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("October Condensed Devanagari", 1, 18)); // NOI18N
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));
        jLabel12.setMaximumSize(new java.awt.Dimension(44, 44));
        jLabel12.setMinimumSize(new java.awt.Dimension(44, 44));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 50, 40));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("October Condensed Devanagari", 1, 18)); // NOI18N
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));
        jLabel13.setMaximumSize(new java.awt.Dimension(44, 44));
        jLabel13.setMinimumSize(new java.awt.Dimension(44, 44));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 50, 40));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("October Condensed Devanagari", 1, 18)); // NOI18N
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));
        jLabel14.setMaximumSize(new java.awt.Dimension(44, 44));
        jLabel14.setMinimumSize(new java.awt.Dimension(44, 44));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 50, 40));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("October Condensed Devanagari", 1, 18)); // NOI18N
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));
        jLabel15.setMaximumSize(new java.awt.Dimension(44, 44));
        jLabel15.setMinimumSize(new java.awt.Dimension(44, 44));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 50, 40));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("October Condensed Devanagari", 1, 18)); // NOI18N
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 3, true));
        jLabel16.setMaximumSize(new java.awt.Dimension(44, 44));
        jLabel16.setMinimumSize(new java.awt.Dimension(44, 44));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 50, 40));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DictionaryTextArea.setColumns(16);
        DictionaryTextArea.setRows(5);
        jScrollPane1.setViewportView(DictionaryTextArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 210, 150));

        SaveButton.setText("Guardar");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));
        jPanel1.add(InputWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 120, -1));

        TimeLabel.setBackground(new java.awt.Color(255, 102, 0));
        TimeLabel.setFont(new java.awt.Font("Bangla MN", 1, 20)); // NOI18N
        TimeLabel.setForeground(new java.awt.Color(255, 102, 0));
        TimeLabel.setText("Sopa De Letras");
        jPanel1.add(TimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 180, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BFS", "DFS", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        LoadButton.setText("Cargar Archivo");
        LoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LoadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        FindWordButton.setText("Buscar Palabra");
        FindWordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindWordButtonActionPerformed(evt);
            }
        });
        jPanel1.add(FindWordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        jLabel18.setFont(new java.awt.Font("Impact", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 204));
        jLabel18.setText("Diccionario:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 170, 30));

        jLabel19.setFont(new java.awt.Font("Kavivanar", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 102));
        jLabel19.setText("Introduce la Palabra para buscar: ");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        TimeLabel1.setBackground(new java.awt.Color(102, 153, 255));
        TimeLabel1.setFont(new java.awt.Font("Baloo Paaji 2", 1, 20)); // NOI18N
        TimeLabel1.setForeground(new java.awt.Color(51, 153, 255));
        TimeLabel1.setText("Tiempo: 0ms");
        jPanel1.add(TimeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 130, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoadButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_LoadButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        File selectedFile = null;
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();

        }
        try {
            JOptionPane.showMessageDialog(this, "Archivo escojido:" + selectedFile.getAbsolutePath(), "Archivo Cargado",
                    JOptionPane.INFORMATION_MESSAGE);
            LinkedList<String> dictionaryWords = readFile(selectedFile);
            displayDictionaryWords(dictionaryWords);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error" + e.getMessage(), "Error de Archivo",
                    JOptionPane.ERROR_MESSAGE);
        }

    }// GEN-LAST:event_LoadButtonActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextField2ActionPerformed

    private void FindWordButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FindWordButtonActionPerformed
        String selectedAlgorithm = (String) jComboBox1.getSelectedItem();
        String word = InputWord.getText();
        char[] wordArray = word.toCharArray();
        Character[] wordCharacters = new Character[wordArray.length];
        for (int i = 0; i < wordArray.length; i++) {
            wordCharacters[i] = wordArray[i];
        } // GEN-LAST:event_jTextField2ActionPerformed

        startTimer();

        boolean wordFound = false;

        switch (selectedAlgorithm) {
            case "BFS":
                wordFound = graphA.breadthFirstSearchArray(wordCharacters);
                break;
            case "DFS":
                wordFound = graphA.depthFirstSearchArray(wordCharacters);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Please select a search algorithm.");
                return;
        }

        stopTimer();

        if (wordFound) {
            JOptionPane.showMessageDialog(this, "Word found!");
        } else {
            JOptionPane.showMessageDialog(this, "Word not found.");
        }

    }// GEN-LAST:event_FindWordButtonActionPerformed

    private void displayDictionaryWords(LinkedList<String> dictionaryWords) {
        String sb = new String();
        int counter = 0;

        while (counter < dictionaryWords.size()) {
            String word = "";
            try {
                word = dictionaryWords.getStringIndex(counter);
            } catch (Exception e) {
            }
            sb = sb + Integer.toString(counter + 1) + ". " + word + System.lineSeparator();
            counter++;
        }
        DictionaryTextArea.setText(sb);
    }

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String newWord = InputWord.getText().trim();

        System.out.println("Entered word: '" + newWord + "' with length: " + newWord.length()); // Debugging statement

        // Check if the length of the new word is at least 3
        if (newWord.length() >= 3) {
            newWord = newWord.toUpperCase();
            int wordCount = DictionaryTextArea.getText().split("\n").length;

            // Create the formatted word with the incremented number
            String numberedWord = (wordCount + 1) + ". " + newWord;
            // Convert to uppercase

            // Add the new word to the DictionaryTextArea
            DictionaryTextArea.append(numberedWord + "\n");
            InputWord.setText("");

            // Save the contents of the DictionaryTextArea to a file
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar archivo de diccionario");
            int userSelection = fileChooser.showSaveDialog(this);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                saveDictionaryToFile(fileToSave);
                JOptionPane.showMessageDialog(this, "El Diccionario Ha Sido Guardado Exitosamente!", "Guardado Exitoso",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            // Show an error message if the word is invalid
            JOptionPane.showMessageDialog(this, "La palabra debe tener al menos 3 letras.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void saveDictionaryToFile(File file) {
        StringBuilder content = new StringBuilder();

        // Get the letters from the JLabels
        content.append("tab\n");
        JLabel[] labels = { jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, jLabel10,
                jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16 };
        for (JLabel label : labels) {
            content.append(label.getText());
        }
        content.append("\n/tab\n");

        // Append the dictionary words from the DictionaryTextArea without numbering
        // between DIC and /DIC
        content.append("dic\n");
        String[] dictionaryWords = DictionaryTextArea.getText().split("\\n");
        for (String word : dictionaryWords) {
            String[] parts = word.split("\\.");
            if (parts.length > 1) {
                content.append(parts[1].trim().toUpperCase()).append("\n");

            } else {
                content.append(word.trim()).append("\n");
            }
        }

        content.append("/dic");

        // Write the combined content to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(content.toString());
        } catch (IOException e) {
            // Handle the IOException
            e.printStackTrace();
            // You can also show a message dialog to inform the user about the error
            JOptionPane.showMessageDialog(this, "Error Guardando Archivo: " + e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void checkDictionaryWords() {
        String selectedAlgorithm = (String) jComboBox1.getSelectedItem();
        if (selectedAlgorithm == null) {
            JOptionPane.showMessageDialog(this, "Please select a search algorithm.");
            return;
        }

        LinkedList<String> dictionaryWordsList = new LinkedList<>(DictionaryTextArea.getText().split("\\n"));
        LinkedList<String> foundWords = new LinkedList<>();
        LinkedList<Character[]> dictionaryWords = new LinkedList<>();

        // Convert dictionary words from String to Character[] arrays
        String word = "";
        for (int i = 0; i < dictionaryWordsList.size(); i++) {
            word = dictionaryWordsList.get(i);
            if (!word.trim().isEmpty()) {
                word = word.trim().toUpperCase();
                dictionaryWords.add(word.chars().mapToObj(c -> (char) c).toArray(Character[]::new));
            }
        }
        LinkedList<String> notFoundWords = new LinkedList<>();

        startTimer();

        Character[] wordChars;
        for (int i = 0; i < dictionaryWords.size(); i++) {
            wordChars = dictionaryWords.get(i);
            boolean wordFound = false;

            switch (selectedAlgorithm) {
                case "BFS":
                    wordFound = graphA.breadthFirstSearchArray(wordChars);
                    break;
                case "DFS":
                    wordFound = graphA.depthFirstSearchArray(wordChars);
                    break;
            }

            if (wordFound) {
                foundWords.add(new String(convertCharacterArrayToCharArray(wordChars)));
            } else {
                notFoundWords.add(new String(convertCharacterArrayToCharArray(wordChars)));
            }

        }

        stopTimer();
        /*
         * String message = "Words found: " + foundWords.size() + "\n" +
         * String.join(", ", foundWords) + "\n\n" +
         * "Words not found: " + notFoundWords.size() + "\n" + String.join(", ",
         * notFoundWords);
         * JOptionPane.showMessageDialog(this, message);
         */
    }

    private char[] convertCharacterArrayToCharArray(Character[] characterArray) {
        char[] charArray = new char[characterArray.length];
        for (int i = 0; i < characterArray.length; i++) {
            charArray[i] = characterArray[i];
        }
        return charArray;
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private LinkedList<String> readFile(File file) {
        LinkedList<String> dictionaryWords = new LinkedList<>();
        String boardLine = "";
        boolean readingBoard = false;
        boolean readingDictionary = false;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Remove commas and trim line
                line = line.replaceAll(",", "").trim();

                if (line.equals("tab")) {
                    readingBoard = true;
                    readingDictionary = false;
                    continue;
                } else if (line.equals("/tab")) {
                    readingBoard = false;
                    continue;
                } else if (line.equals("dic")) {
                    readingBoard = false;
                    readingDictionary = true;
                    continue;
                } else if (line.equals("/dic")) {
                    readingDictionary = false;
                    continue;
                }

                if (readingBoard) {
                    boardLine = line;
                } else if (readingDictionary) {
                    if (!line.matches("^\\d+\\..*")) {
                        dictionaryWords.add(line.toUpperCase());
                    }
                }
            }
            populateBoard(boardLine);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error Leyendo Archivo: " + e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        return dictionaryWords;
    }

    private void populateBoard(String boardLine) {
        // Populate the JLabel components with board letters
        Character[] graphBuilderArray = new Character[boardLine.length()];
        for (int i = 0; i < boardLine.length(); i++) {
            JLabel label = getLabelByIndex(i); // Get the corresponding JLabel
            label.setVisible(true);
            label.setText(String.valueOf(boardLine.charAt(i))); // Set text with board letter
            label.setVisible(true); // Make the label visible
            graphBuilderArray[i] = boardLine.charAt(i);
        }
        this.graphA = new AdjacencyMatrixGraph<>(graphBuilderArray, 4);
    }

    private JLabel getLabelByIndex(int index) {
        // Get the corresponding JLabel based on the index
        switch (index) {
            case 0:
                return jLabel1;
            case 1:
                return jLabel2;
            case 2:
                return jLabel3;
            case 3:
                return jLabel4;
            case 4:
                return jLabel5;
            case 5:
                return jLabel6;
            case 6:
                return jLabel7;
            case 7:
                return jLabel8;
            case 8:
                return jLabel9;
            case 9:
                return jLabel10;
            case 10:
                return jLabel11;
            case 11:
                return jLabel12;
            case 12:
                return jLabel13;
            case 13:
                return jLabel14;
            case 14:
                return jLabel15;
            case 15:
                return jLabel16;
            default:
                return null;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                System.out.println(info.getName());
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DictionaryTextArea;
    private javax.swing.JButton FindWordButton;
    private javax.swing.JTextField InputWord;
    private javax.swing.JButton LoadButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JLabel TimeLabel1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
