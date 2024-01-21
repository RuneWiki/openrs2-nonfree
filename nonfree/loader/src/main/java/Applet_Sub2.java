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

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt4520;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt4521;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean246;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean245;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean247;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean248;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;ILjava/lang/String;ILjava/lang/String;)[B")
	private byte[] method3438(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) String arg3) {
		@Pc(4) byte[] local4 = this.method3442(arg0);
		if (!this.method3443(arg2, local4)) {
			local4 = this.method3440(arg3, arg1, arg2, false);
			if (local4 == null) {
				local4 = this.method3440(arg3, arg1, arg2, true);
			}
			if (local4 == null) {
				this.method3439("download");
				return null;
			}
			if (!this.method3441(arg0, local4)) {
				return null;
			}
			local4 = this.method3442(arg0);
			if (!this.method3443(arg2, local4)) {
				this.method3439("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean247 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt4520 = Integer.parseInt(this.getParameter("width"));
			@Pc(7) int local7 = 32;
			this.anInt4521 = Integer.parseInt(this.getParameter("height"));
			try {
				@Pc(18) int local18 = Integer.parseInt(this.getParameter("modewhat"));
				local7 += local18;
			} catch (@Pc(24) Exception local24) {
			}
			@Pc(26) String local26 = "Loading unpacker";
			@Pc(28) String local28 = "Loading game code";
			try {
				@Pc(32) String local32 = this.getParameter("lang");
				if (local32 != null && local32.equals("1")) {
					local28 = "Lade Spiel-Code";
					local26 = "Lade Entpacker";
				}
			} catch (@Pc(45) Exception local45) {
			}
			@Pc(54) Class101 local54;
			try {
				local54 = new Class101(true, this, local7, "runescape", 24);
			} catch (@Pc(56) Exception local56) {
				this.method3439("nocache");
				return;
			}
			@Pc(65) ClassLoader_Sub1 local65 = new ClassLoader_Sub1();
			try {
				Class.forName("java.util.jar.Pack200");
				@Pc(70) String local70 = "main_file_cache.dat0";
				@Pc(83) byte[] local83 = this.method3438(new File(local54.aFile4, local70), 314259, "runescape_-1133299654.pack200", local28);
				if (local83 == null) {
					return;
				}
				local65.aClass100_1 = new Class100_Sub1(local83);
			} catch (@Pc(95) Throwable local95) {
			}
			if (local65.aClass100_1 == null) {
				@Pc(112) byte[] local112 = this.method3438(new File(local54.aFile4, "game_unpacker.dat"), 19590, "unpackclass_-462058432.pack", local26);
				if (local112 == null) {
					return;
				}
				@Pc(121) ClassLoader_Sub1 local121 = new ClassLoader_Sub1();
				local121.aClass100_1 = new Class100(local112);
				@Pc(129) String local129 = "main_file_cache.dat1";
				@Pc(132) Class local132 = Class.forName("Class100");
				local121.aHashtable1.put(local132.getName(), local132);
				@Pc(143) Class local143 = local121.loadClass("unpackclass");
				local112 = this.method3438(new File(local54.aFile4, local129), 323713, "runescape_1913814320.js5", local28);
				if (local112 == null) {
					return;
				}
				local65.aClass100_1 = (Class100) local143.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local112, Boolean.TRUE);
			}
			@Pc(189) Class local189 = Class.forName("Class103");
			local65.aHashtable1.put(local189.getName(), local189);
			@Pc(199) Class local199 = Class.forName("Class101");
			local65.aHashtable1.put(local199.getName(), local199);
			@Pc(209) Class local209 = Class.forName("Class102");
			local65.aHashtable1.put(local209.getName(), local209);
			@Pc(219) Class local219 = Class.forName("Interface4");
			local65.aHashtable1.put(local219.getName(), local219);
			@Pc(230) Class local230 = local65.loadClass("client");
			synchronized (this) {
				if (this.aBoolean247) {
					return;
				}
				this.anApplet3 = (Applet) local230.getDeclaredConstructor().newInstance();
				local230.getMethod("providesignlink", local199).invoke(null, local54);
				this.anApplet3.init();
				if (this.aBoolean246) {
					this.anApplet3.start();
				}
				if (this.aBoolean248) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(289) Exception local289) {
			RuntimeException_Sub2.anInt4518 = 1913814320;
			if (local289 instanceof InvocationTargetException) {
				@Pc(305) Throwable local305 = ((InvocationTargetException) local289).getTargetException();
				if (local305 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method3425(this, local305, local289.toString());
			} else {
				RuntimeException_Sub2.method3425(this, local289, null);
			}
			this.method3439("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean246 = true;
		this.aBoolean248 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method3439(@OriginalArg(1) String arg0) {
		if (this.aBoolean245) {
			return;
		}
		this.aBoolean245 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(31) Exception local31) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ZI)[B")
	private byte[] method3440(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(20) byte[] local20 = new byte[arg1];
		try {
			@Pc(30) InputStream local30;
			if (arg3) {
				@Pc(35) URL local35 = this.getCodeBase();
				@Pc(43) Socket local43 = new Socket(InetAddress.getByName(local35.getHost()), 443);
				local43.setSoTimeout(10000);
				@Pc(49) OutputStream local49 = local43.getOutputStream();
				local49.write(17);
				local49.write(("JAGGRAB " + local35.getFile() + arg2 + "\n\n").getBytes());
				local30 = local43.getInputStream();
			} else {
				local30 = (new URL(this.getCodeBase(), arg2)).openStream();
			}
			@Pc(79) int local79 = 0;
			@Pc(81) int local81 = -1;
			while (local20.length > local79) {
				@Pc(95) int local95 = local20.length - local79;
				if (local95 > 1000) {
					local95 = 1000;
				}
				@Pc(108) int local108 = local30.read(local20, local79, local95);
				if (local108 < 0) {
					throw new EOFException();
				}
				local79 += local108;
				@Pc(126) int local126 = local79 * 100 / local20.length;
				if (local81 != local126) {
					try {
						@Pc(132) Graphics local132 = this.getGraphics();
						if (local132 == null) {
							this.repaint();
						} else {
							local81 = local126;
							local132.setColor(Color.black);
							@Pc(156) String local156 = arg0 + " - " + local126 + "%";
							local132.fillRect(0, 0, this.anInt4520, this.anInt4521);
							local132.setColor(local17);
							local132.drawRect(this.anInt4520 / 2 - 152, this.anInt4521 / 2 + -18, 303, 33);
							local132.setFont(local8);
							local132.setColor(Color.white);
							local132.drawString(local156, (this.anInt4520 - local12.stringWidth(local156)) / 2, this.anInt4521 / 2 + 4);
						}
					} catch (@Pc(209) Exception local209) {
					}
				}
			}
			local30.close();
		} catch (@Pc(215) IOException local215) {
			return null;
		}
		return this.method3443(arg2, local20) ? local20 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;B[B)Z")
	private boolean method3441(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(11) FileOutputStream local11 = new FileOutputStream(arg0);
			local11.write(arg1, 0, arg1.length);
			local11.close();
			return true;
		} catch (@Pc(22) IOException local22) {
			this.method3439("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/io/File;)[B")
	private byte[] method3442(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(14) int local14 = (int) arg0.length();
			@Pc(17) byte[] local17 = new byte[local14];
			@Pc(28) DataInputStream local28 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			local28.readFully(local17, 0, local14);
			local28.close();
			return local17;
		} catch (@Pc(38) IOException local38) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;[B)Z")
	private boolean method3443(@OriginalArg(1) String arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(13) MessageDigest local13 = MessageDigest.getInstance("SHA");
			local13.reset();
			local13.update(arg1);
			@Pc(21) byte[] local21 = local13.digest();
			if (arg0 == "runescape_-1133299654.pack200") {
				if (local21[0] != -94 || local21[1] != 57 || local21[2] != -18 || local21[3] != -33 || local21[4] != 85 || local21[5] != 101 || local21[6] != -73 || local21[7] != -128 || local21[8] != -54 || local21[9] != 12 || local21[10] != -9 || local21[11] != -55 || local21[12] != -127 || local21[13] != 1 || local21[14] != 69 || local21[15] != 117 || local21[16] != 85 || local21[17] != -90 || local21[18] != 5 || local21[19] != 99) {
					return false;
				}
			} else if (arg0 == "runescape_1913814320.js5") {
				if (local21[0] != -22 || local21[1] != 9 || local21[2] != 74 || local21[3] != -21 || local21[4] != 102 || local21[5] != -37 || local21[6] != -4 || local21[7] != -47 || local21[8] != 35 || local21[9] != 35 || local21[10] != 116 || local21[11] != 20 || local21[12] != 65 || local21[13] != 109 || local21[14] != 100 || local21[15] != 95 || local21[16] != 24 || local21[17] != 120 || local21[18] != 15 || local21[19] != -118) {
					return false;
				}
			} else if (arg0 == "unpackclass_-462058432.pack") {
				if (local21[0] != 88 || local21[1] != 0 || local21[2] != -7 || local21[3] != -109 || local21[4] != 43 || local21[5] != -100 || local21[6] != -104 || local21[7] != 7 || local21[8] != -25 || local21[9] != 69 || local21[10] != 28 || local21[11] != 18 || local21[12] != 106 || local21[13] != 112 || local21[14] != 33 || local21[15] != 50 || local21[16] != 123 || local21[17] != -108 || local21[18] != -80 || local21[19] != 35) {
					return false;
				}
			} else if (arg0 == "jogl_181740960.pack") {
				if (local21[0] != 74 || local21[1] != 7 || local21[2] != -54 || local21[3] != 86 || local21[4] != 3 || local21[5] != 113 || local21[6] != -45 || local21[7] != -123 || local21[8] != 63 || local21[9] != 97 || local21[10] != 69 || local21[11] != -41 || local21[12] != -121 || local21[13] != 126 || local21[14] != -30 || local21[15] != -32 || local21[16] != 33 || local21[17] != -122 || local21[18] != -111 || local21[19] != 63) {
					return false;
				}
			} else if (arg0 == "jogl_-1134983286.dll") {
				if (local21[0] != 43 || local21[1] != 73 || local21[2] != -119 || local21[3] != -99 || local21[4] != -19 || local21[5] != 109 || local21[6] != -62 || local21[7] != 40 || local21[8] != 41 || local21[9] != -91 || local21[10] != -88 || local21[11] != -50 || local21[12] != -38 || local21[13] != -127 || local21[14] != -126 || local21[15] != 33 || local21[16] != -93 || local21[17] != -95 || local21[18] != -123 || local21[19] != 66) {
					return false;
				}
			} else if (arg0 == "jogl_awt_-532687481.dll" && (local21[0] != -26 || local21[1] != 91 || local21[2] != -12 || local21[3] != -87 || local21[4] != 122 || local21[5] != -5 || local21[6] != 108 || local21[7] != 94 || local21[8] != 20 || local21[9] != 111 || local21[10] != 116 || local21[11] != -56 || local21[12] != -10 || local21[13] != 66 || local21[14] != -92 || local21[15] != -125 || local21[16] != -41 || local21[17] != 70 || local21[18] != 81 || local21[19] != -71)) {
				return false;
			}
			return true;
		} catch (@Pc(775) Exception local775) {
			this.method3439("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean248 = true;
		this.aBoolean246 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean246 = this.aBoolean248 = false;
		this.aBoolean247 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}
}
