import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!loader")
public final class Applet_Sub2 extends Applet implements Runnable {

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Lloader!je;")
	private Class86 aClass86_1;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt3178;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt3179;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean126;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean128;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean127;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean129;

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean126 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method2044(@OriginalArg(0) String arg0) {
		if (this.aBoolean129) {
			return;
		}
		this.aBoolean129 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(33) Exception local33) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IBZ)[B")
	private byte[] method2045(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(14) Font local14 = new Font("Helvetica", 1, 13);
		@Pc(18) FontMetrics local18 = this.getFontMetrics(local14);
		@Pc(21) byte[] local21 = new byte[arg2];
		@Pc(26) Color local26 = new Color(9179409);
		try {
			@Pc(67) InputStream local67;
			if (arg3) {
				@Pc(31) URL local31 = this.getCodeBase();
				@Pc(39) Socket local39 = new Socket(InetAddress.getByName(local31.getHost()), 443);
				local39.setSoTimeout(10000);
				@Pc(45) OutputStream local45 = local39.getOutputStream();
				local45.write(17);
				local45.write(("JAGGRAB " + local31.getFile() + arg1 + "\n\n").getBytes());
				local67 = local39.getInputStream();
			} else {
				local67 = (new URL(this.getCodeBase(), arg1)).openStream();
			}
			@Pc(79) int local79 = -1;
			@Pc(81) int local81 = 0;
			while (local81 < local21.length) {
				@Pc(95) int local95 = local21.length - local81;
				if (local95 > 1000) {
					local95 = 1000;
				}
				@Pc(108) int local108 = local67.read(local21, local81, local95);
				if (local108 < 0) {
					throw new EOFException();
				}
				local81 += local108;
				@Pc(126) int local126 = local81 * 100 / local21.length;
				if (local126 != local79) {
					try {
						@Pc(133) Graphics local133 = this.getGraphics();
						if (local133 == null) {
							this.repaint();
						} else {
							local79 = local126;
							@Pc(154) String local154 = arg0 + " - " + local126 + "%";
							local133.setColor(Color.black);
							local133.fillRect(0, 0, this.anInt3179, this.anInt3178);
							local133.setColor(local26);
							local133.drawRect(this.anInt3179 / 2 - 152, this.anInt3178 / 2 - 18, 303, 33);
							local133.setFont(local14);
							local133.setColor(Color.white);
							local133.drawString(local154, (this.anInt3179 - local18.stringWidth(local154)) / 2, this.anInt3178 / 2 + 4);
						}
					} catch (@Pc(209) Exception local209) {
					}
				}
			}
			local67.close();
		} catch (@Pc(215) IOException local215) {
			return null;
		}
		return this.method2048(arg1, local21) ? local21 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/io/File;)[B")
	private byte[] method2046(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(8) int local8 = (int) arg0.length();
			@Pc(19) DataInputStream local19 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(22) byte[] local22 = new byte[local8];
			local19.readFully(local22, 0, local8);
			local19.close();
			return local22;
		} catch (@Pc(38) IOException local38) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean128 = false;
		this.aBoolean127 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean127 = false;
		this.aBoolean128 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/io/File;)[B")
	private byte[] method2047(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) File arg3) {
		@Pc(4) byte[] local4 = this.method2046(arg3);
		if (!this.method2048(arg1, local4)) {
			local4 = this.method2045(arg2, arg1, arg0, false);
			if (local4 == null) {
				local4 = this.method2045(arg2, arg1, arg0, true);
			}
			if (local4 == null) {
				this.method2044("download");
				return null;
			}
			if (!this.method2049(arg3, local4)) {
				return null;
			}
			local4 = this.method2046(arg3);
			if (!this.method2048(arg1, local4)) {
				this.method2044("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;[BI)Z")
	private boolean method2048(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(7) MessageDigest local7 = MessageDigest.getInstance("SHA");
			local7.reset();
			local7.update(arg1);
			@Pc(21) byte[] local21 = local7.digest();
			if (arg0 == "runescape_-373276044.pack200") {
				if (local21[0] != -43 || local21[1] != 51 || local21[2] != 69 || local21[3] != -90 || local21[4] != 44 || local21[5] != -34 || local21[6] != 33 || local21[7] != -91 || local21[8] != -102 || local21[9] != -94 || local21[10] != -35 || local21[11] != -114 || local21[12] != -89 || local21[13] != 21 || local21[14] != 64 || local21[15] != -98 || local21[16] != -113 || local21[17] != -80 || local21[18] != 122 || local21[19] != -2) {
					return false;
				}
			} else if (arg0 == "runescape_1309911875.js5") {
				if (local21[0] != -44 || local21[1] != -25 || local21[2] != 101 || local21[3] != -119 || local21[4] != -120 || local21[5] != 69 || local21[6] != -65 || local21[7] != 67 || local21[8] != -109 || local21[9] != -96 || local21[10] != 114 || local21[11] != -34 || local21[12] != -26 || local21[13] != -7 || local21[14] != -34 || local21[15] != 76 || local21[16] != -109 || local21[17] != -45 || local21[18] != -70 || local21[19] != -56) {
					return false;
				}
			} else if (local21[0] != 23 || local21[1] != 83 || local21[2] != 57 || local21[3] != 35 || local21[4] != 83 || local21[5] != -48 || local21[6] != 29 || local21[7] != -121 || local21[8] != 101 || local21[9] != 45 || local21[10] != -13 || local21[11] != -62 || local21[12] != -10 || local21[13] != 46 || local21[14] != -57 || local21[15] != -48 || local21[16] != 115 || local21[17] != 102 || local21[18] != 94 || local21[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(408) Exception local408) {
			this.method2044("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean127 = this.aBoolean128 = false;
		this.aBoolean126 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt3179 = Integer.parseInt(this.getParameter("width"));
			@Pc(7) int local7 = 32;
			this.anInt3178 = Integer.parseInt(this.getParameter("height"));
			try {
				@Pc(18) int local18 = Integer.parseInt(this.getParameter("modewhat"));
				local7 += local18;
			} catch (@Pc(24) Exception local24) {
			}
			@Pc(26) String local26 = "Loading game code";
			@Pc(28) String local28 = "Loading unpacker";
			try {
				@Pc(32) String local32 = this.getParameter("lang");
				if (local32 != null && local32.equals("1")) {
					local28 = "Lade Entpacker";
					local26 = "Lade Spiel-Code";
				}
			} catch (@Pc(44) Exception local44) {
			}
			try {
				this.aClass86_1 = new Class86(true, this, local7, "runescape", 16);
			} catch (@Pc(56) Exception local56) {
				this.method2044("nocache");
				return;
			}
			@Pc(65) ClassLoader_Sub1 local65 = new ClassLoader_Sub1();
			@Pc(84) byte[] local84;
			try {
				Class.forName("java.util.jar.Pack200");
				local84 = this.method2047(242582, "runescape_-373276044.pack200", local26, new File(this.aClass86_1.aFile4, "main_file_cache.dat0"));
				if (local84 == null) {
					return;
				}
				local65.aClass85_1 = new Class85_Sub1(local84);
			} catch (@Pc(95) Throwable local95) {
			}
			@Pc(126) Class local126;
			if (local65.aClass85_1 == null) {
				local84 = this.method2047(19185, "unpackclass_-163111980.jar", local28, new File(this.aClass86_1.aFile4, "game_unpacker.dat"));
				if (local84 == null) {
					return;
				}
				local65.aClass85_1 = new Class85(local84);
				local126 = Class.forName("Class85");
				local65.aHashtable1.put(local126.getName(), local126);
				@Pc(137) Class local137 = local65.loadClass("unpackclass");
				local65 = new ClassLoader_Sub1();
				local84 = this.method2047(257366, "runescape_1309911875.js5", local26, new File(this.aClass86_1.aFile4, "main_file_cache.dat1"));
				if (local84 == null) {
					return;
				}
				local65.aClass85_1 = (Class85) local137.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local84, Boolean.TRUE);
			}
			local126 = Class.forName("Class87");
			local65.aHashtable1.put(local126.getName(), local126);
			@Pc(199) Class local199 = Class.forName("Class86");
			local65.aHashtable1.put(local199.getName(), local199);
			local126 = Class.forName("Class84");
			local65.aHashtable1.put(local126.getName(), local126);
			local126 = Class.forName("Interface4");
			local65.aHashtable1.put(local126.getName(), local126);
			local126 = local65.loadClass("client");
			synchronized (this) {
				if (this.aBoolean126) {
					return;
				}
				this.anApplet3 = (Applet) local126.getDeclaredConstructor().newInstance();
				local126.getMethod("providesignlink", local199).invoke(null, this.aClass86_1);
				this.anApplet3.init();
				if (this.aBoolean127) {
					this.anApplet3.start();
				}
				if (this.aBoolean128) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(291) Exception local291) {
			RuntimeException_Sub2.anInt3172 = 1309911875;
			if (local291 instanceof InvocationTargetException) {
				@Pc(300) Throwable local300 = ((InvocationTargetException) local291).getTargetException();
				if (local300 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2030(local291.toString(), local300, this);
			} else {
				RuntimeException_Sub2.method2030(null, local291, this);
			}
			this.method2044("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;[BZ)Z")
	private boolean method2049(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method2044("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}
}
