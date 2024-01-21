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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Lloader!c;")
	private Class71 aClass71_1;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt3009;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt3010;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean143;

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt3010 = Integer.parseInt(this.getParameter("width"));
			@Pc(9) int local9 = 32;
			this.anInt3009 = Integer.parseInt(this.getParameter("height"));
			try {
				@Pc(20) int local20 = Integer.parseInt(this.getParameter("modewhat"));
				local9 += local20;
			} catch (@Pc(26) Exception local26) {
			}
			@Pc(28) String local28 = "Loading game code";
			@Pc(30) String local30 = "Loading unpacker";
			try {
				@Pc(34) String local34 = this.getParameter("lang");
				if (local34 != null && local34.equals("1")) {
					local28 = "Lade Spiel-Code";
					local30 = "Lade Entpacker";
				}
			} catch (@Pc(48) Exception local48) {
			}
			try {
				this.aClass71_1 = new Class71(true, this, InetAddress.getByName(this.getCodeBase().getHost()), local9, "runescape", 14);
			} catch (@Pc(64) Exception local64) {
				this.method2121("nocache");
				return;
			}
			@Pc(75) ClassLoader_Sub1 local75 = new ClassLoader_Sub1();
			@Pc(92) byte[] local92;
			try {
				Class.forName("java.util.jar.Pack200");
				local92 = this.method2123("runescape.pack200?crc=1641013194", new File(this.aClass71_1.aString16, "main_file_cache.dat0"), 215902, local28);
				if (local92 == null) {
					return;
				}
				local75.aClass72_1 = new Class72_Sub1(local92);
			} catch (@Pc(105) Throwable local105) {
			}
			@Pc(139) Class local139;
			if (local75.aClass72_1 == null) {
				local92 = this.method2123("unpackclass.jar?crc=-549807395", new File(this.aClass71_1.aString16, "shared_game_unpacker.dat"), 17836, local30);
				if (local92 == null) {
					return;
				}
				local75.aClass72_1 = new Class72(local92);
				local139 = Class.forName("Class72");
				local75.aHashtable1.put(local139.getName(), local139);
				@Pc(150) Class local150 = local75.loadClass("unpackclass");
				local75 = new ClassLoader_Sub1();
				local92 = this.method2123("runescape.js5?crc=-616135616", new File(this.aClass71_1.aString16, "main_file_cache.dat1"), 233774, local28);
				if (local92 == null) {
					return;
				}
				local75.aClass72_1 = (Class72) local150.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local92, Boolean.TRUE);
			}
			local139 = Class.forName("Class73");
			local75.aHashtable1.put(local139.getName(), local139);
			@Pc(213) Class local213 = Class.forName("Class71");
			local75.aHashtable1.put(local213.getName(), local213);
			local139 = Class.forName("Class74");
			local75.aHashtable1.put(local139.getName(), local139);
			local139 = Class.forName("Interface5");
			local75.aHashtable1.put(local139.getName(), local139);
			local139 = Class.forName("Interface6");
			local75.aHashtable1.put(local139.getName(), local139);
			local139 = local75.loadClass("client");
			this.anApplet3 = (Applet) local139.getDeclaredConstructor().newInstance();
			local139.getMethod("providesignlink", local213).invoke(null, this.aClass71_1);
			this.anApplet3.init();
			this.anApplet3.start();
		} catch (@Pc(286) Exception local286) {
			RuntimeException_Sub2.anInt3002 = -616135616;
			if (local286 instanceof InvocationTargetException) {
				@Pc(302) Throwable local302 = ((InvocationTargetException) local286).getTargetException();
				if (local302 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2084(local302, this, local286.toString());
			} else {
				RuntimeException_Sub2.method2084(local286, this, null);
			}
			this.method2121("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;BLjava/lang/String;I)[B")
	private byte[] method2118(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(20) byte[] local20 = new byte[arg3];
		try {
			@Pc(35) InputStream local35;
			if (arg0) {
				@Pc(40) URL local40 = this.getCodeBase();
				@Pc(48) Socket local48 = new Socket(InetAddress.getByName(local40.getHost()), 443);
				local48.setSoTimeout(10000);
				@Pc(54) OutputStream local54 = local48.getOutputStream();
				local54.write(17);
				local54.write(("JAGGRAB " + local40.getFile() + arg2 + "\n\n").getBytes());
				local35 = local48.getInputStream();
			} else {
				local35 = (new URL(this.getCodeBase(), arg2)).openStream();
			}
			@Pc(78) int local78 = -1;
			@Pc(80) int local80 = 0;
			while (local80 < local20.length) {
				@Pc(94) int local94 = local20.length - local80;
				if (local94 > 1000) {
					local94 = 1000;
				}
				@Pc(105) int local105 = local35.read(local20, local80, local94);
				if (local105 < 0) {
					throw new EOFException();
				}
				local80 += local105;
				@Pc(122) int local122 = local80 * 100 / local20.length;
				if (local78 != local122) {
					try {
						@Pc(132) Graphics local132 = this.getGraphics();
						if (local132 == null) {
							this.repaint();
						} else {
							local132.setColor(Color.black);
							@Pc(150) String local150 = arg1 + " - " + local122 + "%";
							local78 = local122;
							local132.fillRect(0, 0, this.anInt3010, this.anInt3009);
							local132.setColor(local17);
							local132.drawRect(this.anInt3010 / 2 - 152, this.anInt3009 / 2 - 18, 303, 33);
							local132.setFont(local8);
							local132.setColor(Color.white);
							local132.drawString(local150, (this.anInt3010 - local12.stringWidth(local150)) / 2, this.anInt3009 / 2 + 4);
						}
					} catch (@Pc(208) Exception local208) {
					}
				}
			}
			local35.close();
		} catch (@Pc(214) IOException local214) {
			return null;
		}
		return this.method2120(arg2, local20) ? local20 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	private boolean method2119(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(12) FileOutputStream local12 = new FileOutputStream(arg0);
			local12.write(arg1, 0, arg1.length);
			local12.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			this.method2121("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B[B)Z")
	private boolean method2120(@OriginalArg(0) String arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(16) MessageDigest local16 = MessageDigest.getInstance("SHA");
			local16.reset();
			local16.update(arg1);
			@Pc(24) byte[] local24 = local16.digest();
			if (arg0 == "runescape.pack200?crc=1641013194") {
				if (local24[0] != 63 || local24[1] != 90 || local24[2] != 103 || local24[3] != -20 || local24[4] != 82 || local24[5] != 74 || local24[6] != -32 || local24[7] != -87 || local24[8] != -69 || local24[9] != -13 || local24[10] != 100 || local24[11] != 58 || local24[12] != -1 || local24[13] != 110 || local24[14] != 93 || local24[15] != 24 || local24[16] != 42 || local24[17] != 12 || local24[18] != -55 || local24[19] != -69) {
					return false;
				}
			} else if (arg0 == "runescape.js5?crc=-616135616") {
				if (local24[0] != -128 || local24[1] != 120 || local24[2] != -89 || local24[3] != 21 || local24[4] != -33 || local24[5] != -84 || local24[6] != 13 || local24[7] != -18 || local24[8] != 10 || local24[9] != 31 || local24[10] != 83 || local24[11] != -50 || local24[12] != -47 || local24[13] != -100 || local24[14] != 53 || local24[15] != -91 || local24[16] != -122 || local24[17] != -85 || local24[18] != -85 || local24[19] != -83) {
					return false;
				}
			} else if (local24[0] != 3 || local24[1] != -21 || local24[2] != 65 || local24[3] != -60 || local24[4] != -33 || local24[5] != -24 || local24[6] != 92 || local24[7] != 4 || local24[8] != -2 || local24[9] != 48 || local24[10] != 106 || local24[11] != 50 || local24[12] != -46 || local24[13] != -31 || local24[14] != -44 || local24[15] != 120 || local24[16] != -104 || local24[17] != 72 || local24[18] != 50 || local24[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(401) Exception local401) {
			this.method2121("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method2121(@OriginalArg(1) String arg0) {
		if (this.aBoolean143) {
			return;
		}
		this.aBoolean143 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(36) Exception local36) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method2122(@OriginalArg(0) File arg0) {
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
		} catch (@Pc(39) IOException local39) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/io/File;IBLjava/lang/String;)[B")
	private byte[] method2123(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		@Pc(6) byte[] local6 = this.method2122(arg1);
		if (!this.method2120(arg0, local6)) {
			local6 = this.method2118(false, arg3, arg0, arg2);
			if (local6 == null) {
				local6 = this.method2118(true, arg3, arg0, arg2);
			}
			if (local6 == null) {
				this.method2121("download");
				return null;
			}
			if (!this.method2119(arg1, local6)) {
				return null;
			}
			local6 = this.method2122(arg1);
			if (!this.method2120(arg0, local6)) {
				this.method2121("mismatch");
				return null;
			}
		}
		return local6;
	}
}
