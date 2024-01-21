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

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt4291;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt4292;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean194;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean193;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean195;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean196;

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method3359(@OriginalArg(0) String arg0) {
		if (this.aBoolean195) {
			return;
		}
		this.aBoolean195 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(40) Exception local40) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;[B)Z")
	private boolean method3360(@OriginalArg(1) String arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(7) MessageDigest local7 = MessageDigest.getInstance("SHA");
			local7.reset();
			local7.update(arg1);
			@Pc(20) byte[] local20 = local7.digest();
			if (arg0 == "runescape_1470963638.pack200") {
				if (local20[0] != 14 || local20[1] != 59 || local20[2] != -21 || local20[3] != 111 || local20[4] != 111 || local20[5] != -15 || local20[6] != 115 || local20[7] != -76 || local20[8] != 113 || local20[9] != -91 || local20[10] != 20 || local20[11] != 26 || local20[12] != -58 || local20[13] != 61 || local20[14] != 105 || local20[15] != 85 || local20[16] != -1 || local20[17] != -84 || local20[18] != 98 || local20[19] != -71) {
					return false;
				}
			} else if (arg0 == "runescape_918604805.js5") {
				if (local20[0] != -90 || local20[1] != -105 || local20[2] != -83 || local20[3] != 123 || local20[4] != 61 || local20[5] != -70 || local20[6] != -44 || local20[7] != 2 || local20[8] != 122 || local20[9] != -9 || local20[10] != 105 || local20[11] != 45 || local20[12] != 89 || local20[13] != -42 || local20[14] != -5 || local20[15] != 125 || local20[16] != -46 || local20[17] != -54 || local20[18] != -2 || local20[19] != 50) {
					return false;
				}
			} else if (arg0 == "unpackclass_-462058432.pack") {
				if (local20[0] != 88 || local20[1] != 0 || local20[2] != -7 || local20[3] != -109 || local20[4] != 43 || local20[5] != -100 || local20[6] != -104 || local20[7] != 7 || local20[8] != -25 || local20[9] != 69 || local20[10] != 28 || local20[11] != 18 || local20[12] != 106 || local20[13] != 112 || local20[14] != 33 || local20[15] != 50 || local20[16] != 123 || local20[17] != -108 || local20[18] != -80 || local20[19] != 35) {
					return false;
				}
			} else if (arg0 == "jogl_181740960.pack") {
				if (local20[0] != 74 || local20[1] != 7 || local20[2] != -54 || local20[3] != 86 || local20[4] != 3 || local20[5] != 113 || local20[6] != -45 || local20[7] != -123 || local20[8] != 63 || local20[9] != 97 || local20[10] != 69 || local20[11] != -41 || local20[12] != -121 || local20[13] != 126 || local20[14] != -30 || local20[15] != -32 || local20[16] != 33 || local20[17] != -122 || local20[18] != -111 || local20[19] != 63) {
					return false;
				}
			} else if (arg0 == "jogl_-1134983286.dll") {
				if (local20[0] != 43 || local20[1] != 73 || local20[2] != -119 || local20[3] != -99 || local20[4] != -19 || local20[5] != 109 || local20[6] != -62 || local20[7] != 40 || local20[8] != 41 || local20[9] != -91 || local20[10] != -88 || local20[11] != -50 || local20[12] != -38 || local20[13] != -127 || local20[14] != -126 || local20[15] != 33 || local20[16] != -93 || local20[17] != -95 || local20[18] != -123 || local20[19] != 66) {
					return false;
				}
			} else if (arg0 == "jogl_awt_-532687481.dll" && (local20[0] != -26 || local20[1] != 91 || local20[2] != -12 || local20[3] != -87 || local20[4] != 122 || local20[5] != -5 || local20[6] != 108 || local20[7] != 94 || local20[8] != 20 || local20[9] != 111 || local20[10] != 116 || local20[11] != -56 || local20[12] != -10 || local20[13] != 66 || local20[14] != -92 || local20[15] != -125 || local20[16] != -41 || local20[17] != 70 || local20[18] != 81 || local20[19] != -71)) {
				return false;
			}
			return true;
		} catch (@Pc(787) Exception local787) {
			this.method3359("sha");
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/io/File;)Z")
	private boolean method3361(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			this.method3359("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;Ljava/io/File;)[B")
	private byte[] method3362(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) File arg3) {
		@Pc(10) byte[] local10 = this.method3364(arg3);
		if (!this.method3360(arg2, local10)) {
			local10 = this.method3363(arg0, arg1, arg2, false);
			if (local10 == null) {
				local10 = this.method3363(arg0, arg1, arg2, true);
			}
			if (local10 == null) {
				this.method3359("download");
				return null;
			}
			if (!this.method3361(local10, arg3)) {
				return null;
			}
			local10 = this.method3364(arg3);
			if (!this.method3360(arg2, local10)) {
				this.method3359("mismatch");
				return null;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean194 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean196 = true;
		this.aBoolean193 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;Z)[B")
	private byte[] method3363(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		@Pc(14) Font local14 = new Font("Helvetica", 1, 13);
		@Pc(18) FontMetrics local18 = this.getFontMetrics(local14);
		@Pc(23) Color local23 = new Color(9179409);
		@Pc(26) byte[] local26 = new byte[arg1];
		try {
			@Pc(36) InputStream local36;
			if (arg3) {
				@Pc(41) URL local41 = this.getCodeBase();
				@Pc(49) Socket local49 = new Socket(InetAddress.getByName(local41.getHost()), 443);
				local49.setSoTimeout(10000);
				@Pc(55) OutputStream local55 = local49.getOutputStream();
				local55.write(17);
				local55.write(("JAGGRAB " + local41.getFile() + arg2 + "\n\n").getBytes());
				local36 = local49.getInputStream();
			} else {
				local36 = (new URL(this.getCodeBase(), arg2)).openStream();
			}
			@Pc(79) int local79 = 0;
			@Pc(81) int local81 = -1;
			while (local26.length > local79) {
				@Pc(95) int local95 = local26.length - local79;
				if (local95 > 1000) {
					local95 = 1000;
				}
				@Pc(107) int local107 = local36.read(local26, local79, local95);
				if (local107 < 0) {
					throw new EOFException();
				}
				local79 += local107;
				@Pc(128) int local128 = local79 * 100 / local26.length;
				if (local128 != local81) {
					try {
						@Pc(135) Graphics local135 = this.getGraphics();
						if (local135 == null) {
							this.repaint();
						} else {
							local135.setColor(Color.black);
							local135.fillRect(0, 0, this.anInt4292, this.anInt4291);
							local81 = local128;
							local135.setColor(local23);
							local135.drawRect(this.anInt4292 / 2 - 152, this.anInt4291 / 2 + -18, 303, 33);
							local135.setFont(local14);
							local135.setColor(Color.white);
							@Pc(192) String local192 = arg0 + " - " + local128 + "%";
							local135.drawString(local192, (this.anInt4292 - local18.stringWidth(local192)) / 2, this.anInt4291 / 2 + 4);
						}
					} catch (@Pc(212) Exception local212) {
					}
				}
			}
			local36.close();
		} catch (@Pc(218) IOException local218) {
			return null;
		}
		return this.method3360(arg2, local26) ? local26 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean196 = false;
		this.aBoolean193 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method3364(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(8) int local8 = (int) arg0.length();
			@Pc(25) DataInputStream local25 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(28) byte[] local28 = new byte[local8];
			local25.readFully(local28, 0, local8);
			local25.close();
			return local28;
		} catch (@Pc(38) IOException local38) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean193 = this.aBoolean196 = false;
		this.aBoolean194 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt4292 = Integer.parseInt(this.getParameter("width"));
			this.anInt4291 = Integer.parseInt(this.getParameter("height"));
			@Pc(13) int local13 = 32;
			try {
				@Pc(18) int local18 = Integer.parseInt(this.getParameter("modewhat"));
				local13 += local18;
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
			@Pc(54) Class104 local54;
			try {
				local54 = new Class104(true, this, local13, "runescape", 24);
			} catch (@Pc(56) Exception local56) {
				this.method3359("nocache");
				return;
			}
			@Pc(65) ClassLoader_Sub1 local65 = new ClassLoader_Sub1();
			try {
				Class.forName("java.util.jar.Pack200");
				@Pc(70) String local70 = "main_file_cache.dat0";
				@Pc(83) byte[] local83 = this.method3362(local28, 313724, "runescape_1470963638.pack200", new File(local54.aFile5, local70));
				if (local83 == null) {
					return;
				}
				local65.aClass102_1 = new Class102_Sub1(local83);
			} catch (@Pc(95) Throwable local95) {
			}
			if (local65.aClass102_1 == null) {
				@Pc(111) byte[] local111 = this.method3362(local26, 19590, "unpackclass_-462058432.pack", new File(local54.aFile5, "game_unpacker.dat"));
				if (local111 == null) {
					return;
				}
				@Pc(119) ClassLoader_Sub1 local119 = new ClassLoader_Sub1();
				local119.aClass102_1 = new Class102(local111);
				@Pc(127) String local127 = "main_file_cache.dat1";
				@Pc(130) Class local130 = Class.forName("Class102");
				local119.aHashtable1.put(local130.getName(), local130);
				@Pc(141) Class local141 = local119.loadClass("unpackclass");
				local111 = this.method3362(local28, 322301, "runescape_918604805.js5", new File(local54.aFile5, local127));
				if (local111 == null) {
					return;
				}
				local65.aClass102_1 = (Class102) local141.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local111, Boolean.TRUE);
			}
			@Pc(187) Class local187 = Class.forName("Class105");
			local65.aHashtable1.put(local187.getName(), local187);
			@Pc(197) Class local197 = Class.forName("Class104");
			local65.aHashtable1.put(local197.getName(), local197);
			@Pc(207) Class local207 = Class.forName("Class103");
			local65.aHashtable1.put(local207.getName(), local207);
			@Pc(217) Class local217 = Class.forName("Interface4");
			local65.aHashtable1.put(local217.getName(), local217);
			@Pc(228) Class local228 = local65.loadClass("client");
			synchronized (this) {
				if (this.aBoolean194) {
					return;
				}
				this.anApplet3 = (Applet) local228.getDeclaredConstructor().newInstance();
				local228.getMethod("providesignlink", local197).invoke(null, local54);
				this.anApplet3.init();
				if (this.aBoolean193) {
					this.anApplet3.start();
				}
				if (this.aBoolean196) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(287) Exception local287) {
			RuntimeException_Sub2.anInt4286 = 918604805;
			if (local287 instanceof InvocationTargetException) {
				@Pc(296) Throwable local296 = ((InvocationTargetException) local287).getTargetException();
				if (local296 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method3345(local287.toString(), local296, this);
			} else {
				RuntimeException_Sub2.method3345(null, local287, this);
			}
			this.method3359("crash");
		}
	}
}
