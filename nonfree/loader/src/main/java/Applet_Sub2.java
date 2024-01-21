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

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt4477;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt4478;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean188;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean189;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean190;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean191;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;B)[B")
	private byte[] method3336(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(12) byte[] local12 = new byte[local9];
			@Pc(23) DataInputStream local23 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			local23.readFully(local12, 0, local9);
			local23.close();
			return local12;
		} catch (@Pc(33) IOException local33) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean188 = this.aBoolean190 = false;
		this.aBoolean191 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/io/File;IILjava/lang/String;)[B")
	private byte[] method3337(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		@Pc(4) byte[] local4 = this.method3336(arg1);
		if (!this.method3338(local4, arg3)) {
			local4 = this.method3341(false, arg3, arg2, arg0);
			if (local4 == null) {
				local4 = this.method3341(true, arg3, arg2, arg0);
			}
			if (local4 == null) {
				this.method3339("download");
				return null;
			}
			if (!this.method3340(arg1, local4)) {
				return null;
			}
			local4 = this.method3336(arg1);
			if (!this.method3338(local4, arg3)) {
				this.method3339("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean188 = true;
		this.aBoolean190 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/lang/String;B)Z")
	private boolean method3338(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg0);
			@Pc(16) byte[] local16 = local8.digest();
			if (arg1 == "runescape_1224819536.pack200") {
				if (local16[0] != 72 || local16[1] != 99 || local16[2] != 111 || local16[3] != 60 || local16[4] != 73 || local16[5] != 114 || local16[6] != -56 || local16[7] != -27 || local16[8] != 119 || local16[9] != 104 || local16[10] != 26 || local16[11] != 108 || local16[12] != -62 || local16[13] != -118 || local16[14] != -7 || local16[15] != 104 || local16[16] != 79 || local16[17] != -81 || local16[18] != -58 || local16[19] != -83) {
					return false;
				}
			} else if (arg1 == "runescape_-1811112143.js5") {
				if (local16[0] != 63 || local16[1] != -65 || local16[2] != 65 || local16[3] != -127 || local16[4] != -13 || local16[5] != 6 || local16[6] != 95 || local16[7] != -120 || local16[8] != 93 || local16[9] != 6 || local16[10] != -99 || local16[11] != -70 || local16[12] != 93 || local16[13] != -112 || local16[14] != -28 || local16[15] != 107 || local16[16] != 100 || local16[17] != 97 || local16[18] != 123 || local16[19] != -76) {
					return false;
				}
			} else if (arg1 == "unpackclass_-462058432.pack") {
				if (local16[0] != 88 || local16[1] != 0 || local16[2] != -7 || local16[3] != -109 || local16[4] != 43 || local16[5] != -100 || local16[6] != -104 || local16[7] != 7 || local16[8] != -25 || local16[9] != 69 || local16[10] != 28 || local16[11] != 18 || local16[12] != 106 || local16[13] != 112 || local16[14] != 33 || local16[15] != 50 || local16[16] != 123 || local16[17] != -108 || local16[18] != -80 || local16[19] != 35) {
					return false;
				}
			} else if (arg1 == "jogl_181740960.pack") {
				if (local16[0] != 74 || local16[1] != 7 || local16[2] != -54 || local16[3] != 86 || local16[4] != 3 || local16[5] != 113 || local16[6] != -45 || local16[7] != -123 || local16[8] != 63 || local16[9] != 97 || local16[10] != 69 || local16[11] != -41 || local16[12] != -121 || local16[13] != 126 || local16[14] != -30 || local16[15] != -32 || local16[16] != 33 || local16[17] != -122 || local16[18] != -111 || local16[19] != 63) {
					return false;
				}
			} else if (arg1 == "jogl_-1134983286.dll") {
				if (local16[0] != 43 || local16[1] != 73 || local16[2] != -119 || local16[3] != -99 || local16[4] != -19 || local16[5] != 109 || local16[6] != -62 || local16[7] != 40 || local16[8] != 41 || local16[9] != -91 || local16[10] != -88 || local16[11] != -50 || local16[12] != -38 || local16[13] != -127 || local16[14] != -126 || local16[15] != 33 || local16[16] != -93 || local16[17] != -95 || local16[18] != -123 || local16[19] != 66) {
					return false;
				}
			} else if (arg1 == "jogl_awt_-532687481.dll" && (local16[0] != -26 || local16[1] != 91 || local16[2] != -12 || local16[3] != -87 || local16[4] != 122 || local16[5] != -5 || local16[6] != 108 || local16[7] != 94 || local16[8] != 20 || local16[9] != 111 || local16[10] != 116 || local16[11] != -56 || local16[12] != -10 || local16[13] != 66 || local16[14] != -92 || local16[15] != -125 || local16[16] != -41 || local16[17] != 70 || local16[18] != 81 || local16[19] != -71)) {
				return false;
			}
			return true;
		} catch (@Pc(784) Exception local784) {
			this.method3339("sha");
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method3339(@OriginalArg(1) String arg0) {
		if (this.aBoolean189) {
			return;
		}
		this.aBoolean189 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(41) Exception local41) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	private boolean method3340(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method3339("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;I)[B")
	private byte[] method3341(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(20) byte[] local20 = new byte[arg2];
		try {
			@Pc(30) InputStream local30;
			if (arg0) {
				@Pc(35) URL local35 = this.getCodeBase();
				@Pc(43) Socket local43 = new Socket(InetAddress.getByName(local35.getHost()), 443);
				local43.setSoTimeout(10000);
				@Pc(49) OutputStream local49 = local43.getOutputStream();
				local49.write(17);
				local49.write(("JAGGRAB " + local35.getFile() + arg1 + "\n\n").getBytes());
				local30 = local43.getInputStream();
			} else {
				local30 = (new URL(this.getCodeBase(), arg1)).openStream();
			}
			@Pc(73) int local73 = -1;
			@Pc(75) int local75 = 0;
			while (local20.length > local75) {
				@Pc(89) int local89 = local20.length - local75;
				if (local89 > 1000) {
					local89 = 1000;
				}
				@Pc(100) int local100 = local30.read(local20, local75, local89);
				if (local100 < 0) {
					throw new EOFException();
				}
				local75 += local100;
				@Pc(121) int local121 = local75 * 100 / local20.length;
				if (local121 != local73) {
					try {
						@Pc(127) Graphics local127 = this.getGraphics();
						if (local127 == null) {
							this.repaint();
						} else {
							local73 = local121;
							@Pc(145) String local145 = arg3 + " - " + local121 + "%";
							local127.setColor(Color.black);
							local127.fillRect(0, 0, this.anInt4477, this.anInt4478);
							local127.setColor(local17);
							local127.drawRect(this.anInt4477 / 2 - 152, this.anInt4478 / 2 + -18, 303, 33);
							local127.setFont(local8);
							local127.setColor(Color.white);
							local127.drawString(local145, (this.anInt4477 - local12.stringWidth(local145)) / 2, this.anInt4478 / 2 + 4);
						}
					} catch (@Pc(205) Exception local205) {
					}
				}
			}
			local30.close();
		} catch (@Pc(219) IOException local219) {
			return null;
		}
		return this.method3338(local20, arg1) ? local20 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt4477 = Integer.parseInt(this.getParameter("width"));
			@Pc(7) int local7 = 32;
			this.anInt4478 = Integer.parseInt(this.getParameter("height"));
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
			} catch (@Pc(45) Exception local45) {
			}
			@Pc(54) Class101 local54;
			try {
				local54 = new Class101(true, this, local7, "runescape", 24);
			} catch (@Pc(56) Exception local56) {
				this.method3339("nocache");
				return;
			}
			@Pc(65) ClassLoader_Sub1 local65 = new ClassLoader_Sub1();
			try {
				Class.forName("java.util.jar.Pack200");
				@Pc(70) String local70 = "main_file_cache.dat0";
				@Pc(83) byte[] local83 = this.method3337(local26, new File(local54.aFile4, local70), 331990, "runescape_1224819536.pack200");
				if (local83 == null) {
					return;
				}
				local65.aClass100_1 = new Class100_Sub1(local83);
			} catch (@Pc(94) Throwable local94) {
			}
			if (local65.aClass100_1 == null) {
				@Pc(110) byte[] local110 = this.method3337(local28, new File(local54.aFile4, "game_unpacker.dat"), 19590, "unpackclass_-462058432.pack");
				if (local110 == null) {
					return;
				}
				@Pc(118) ClassLoader_Sub1 local118 = new ClassLoader_Sub1();
				local118.aClass100_1 = new Class100(local110);
				@Pc(126) String local126 = "main_file_cache.dat1";
				@Pc(129) Class local129 = Class.forName("Class100");
				local118.aHashtable3.put(local129.getName(), local129);
				@Pc(140) Class local140 = local118.loadClass("unpackclass");
				local110 = this.method3337(local26, new File(local54.aFile4, local126), 320713, "runescape_-1811112143.js5");
				if (local110 == null) {
					return;
				}
				local65.aClass100_1 = (Class100) local140.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local110, Boolean.TRUE);
			}
			@Pc(188) Class local188 = Class.forName("Class103");
			local65.aHashtable3.put(local188.getName(), local188);
			@Pc(198) Class local198 = Class.forName("Class101");
			local65.aHashtable3.put(local198.getName(), local198);
			@Pc(208) Class local208 = Class.forName("Class102");
			local65.aHashtable3.put(local208.getName(), local208);
			@Pc(218) Class local218 = Class.forName("Interface4");
			local65.aHashtable3.put(local218.getName(), local218);
			@Pc(229) Class local229 = local65.loadClass("client");
			synchronized (this) {
				if (this.aBoolean191) {
					return;
				}
				this.anApplet3 = (Applet) local229.getDeclaredConstructor().newInstance();
				local229.getMethod("providesignlink", local198).invoke(null, local54);
				this.anApplet3.init();
				if (this.aBoolean188) {
					this.anApplet3.start();
				}
				if (this.aBoolean190) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(290) Exception local290) {
			RuntimeException_Sub2.anInt4471 = -1811112143;
			if (local290 instanceof InvocationTargetException) {
				@Pc(306) Throwable local306 = ((InvocationTargetException) local290).getTargetException();
				if (local306 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method3322(local306, this, local290.toString());
			} else {
				RuntimeException_Sub2.method3322(local290, this, null);
			}
			this.method3339("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean191 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean190 = true;
		this.aBoolean188 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}
}
