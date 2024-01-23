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
public final class loader extends Applet implements Runnable {

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt4812;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt4813;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean294 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean295 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean296 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean297 = false;

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean295 = true;
		this.aBoolean294 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method3347(@OriginalArg(1) String arg0) {
		if (this.aBoolean296) {
			return;
		}
		this.aBoolean296 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt4813 = Integer.parseInt(this.getParameter("width"));
			@Pc(7) int local7 = 32;
			this.anInt4812 = Integer.parseInt(this.getParameter("height"));
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
			@Pc(54) Class111 local54;
			try {
				local54 = new Class111(true, this, local7, "runescape", 27);
			} catch (@Pc(56) Exception local56) {
				this.method3347("nocache");
				return;
			}
			@Pc(65) ClassLoader_Sub1 local65 = new ClassLoader_Sub1();
			try {
				@Pc(67) String local67 = "main_file_cache.dat0";
				Class.forName("java.util.jar.Pack200");
				@Pc(83) byte[] local83 = this.method3351("runescape_-105854972.pack200", local28, new File(local54.aFile6, local67), 330111);
				if (local83 == null) {
					return;
				}
				local65.anUnpack1 = new unpack_Sub1(local83);
			} catch (@Pc(94) Throwable local94) {
			}
			if (local65.anUnpack1 == null) {
				@Pc(110) byte[] local110 = this.method3351("unpackclass_-462058432.pack", local26, new File(local54.aFile6, "game_unpacker.dat"), 19590);
				if (local110 == null) {
					return;
				}
				@Pc(119) ClassLoader_Sub1 local119 = new ClassLoader_Sub1();
				local119.anUnpack1 = new unpack(local110);
				@Pc(127) String local127 = "main_file_cache.dat1";
				@Pc(130) Class local130 = Class.forName("unpack");
				local119.aHashtable1.put(local130.getName(), local130);
				@Pc(141) Class local141 = local119.loadClass("unpackclass");
				local110 = this.method3351("runescape_472596340.js5", local28, new File(local54.aFile6, local127), 338490);
				if (local110 == null) {
					return;
				}
				local65.anUnpack1 = (unpack) local141.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local110, Boolean.TRUE);
			}
			@Pc(189) Class local189 = Class.forName("Class109");
			local65.aHashtable1.put(local189.getName(), local189);
			@Pc(199) Class local199 = Class.forName("Class111");
			local65.aHashtable1.put(local199.getName(), local199);
			@Pc(209) Class local209 = Class.forName("Class110");
			local65.aHashtable1.put(local209.getName(), local209);
			@Pc(219) Class local219 = Class.forName("Interface5");
			local65.aHashtable1.put(local219.getName(), local219);
			@Pc(230) Class local230 = local65.loadClass("client");
			synchronized (this) {
				if (this.aBoolean297) {
					return;
				}
				this.anApplet2 = (Applet) local230.getDeclaredConstructor().newInstance();
				local230.getMethod("providesignlink", local199).invoke(null, local54);
				this.anApplet2.init();
				if (this.aBoolean295) {
					this.anApplet2.start();
				}
				if (this.aBoolean294) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(291) Exception local291) {
			RuntimeException_Sub2.anInt4811 = 472596340;
			if (local291 instanceof InvocationTargetException) {
				@Pc(307) Throwable local307 = ((InvocationTargetException) local291).getTargetException();
				if (local307 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method3338(this, local307, local291.toString());
			} else {
				RuntimeException_Sub2.method3338(this, local291, null);
			}
			this.method3347("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean295 = this.aBoolean294 = false;
		this.aBoolean297 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;IB)[B")
	private byte[] method3348(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(20) byte[] local20 = new byte[arg3];
		try {
			@Pc(61) InputStream local61;
			if (arg0) {
				@Pc(25) URL local25 = this.getCodeBase();
				@Pc(33) Socket local33 = new Socket(InetAddress.getByName(local25.getHost()), 443);
				local33.setSoTimeout(10000);
				@Pc(39) OutputStream local39 = local33.getOutputStream();
				local39.write(17);
				local39.write(("JAGGRAB " + local25.getFile() + arg2 + "\n\n").getBytes());
				local61 = local33.getInputStream();
			} else {
				local61 = (new URL(this.getCodeBase(), arg2)).openStream();
			}
			@Pc(79) int local79 = -1;
			@Pc(81) int local81 = 0;
			while (local81 < local20.length) {
				@Pc(95) int local95 = local20.length - local81;
				if (local95 > 1000) {
					local95 = 1000;
				}
				@Pc(109) int local109 = local61.read(local20, local81, local95);
				if (local109 < 0) {
					throw new EOFException();
				}
				local81 += local109;
				@Pc(128) int local128 = local81 * 100 / local20.length;
				if (local79 != local128) {
					try {
						@Pc(134) Graphics local134 = this.getGraphics();
						if (local134 == null) {
							this.repaint();
						} else {
							local79 = local128;
							local134.setColor(Color.black);
							local134.fillRect(0, 0, this.anInt4813, this.anInt4812);
							local134.setColor(local17);
							local134.drawRect(this.anInt4813 / 2 - 152, this.anInt4812 / 2 + -18, 303, 33);
							@Pc(186) String local186 = arg1 + " - " + local128 + "%";
							local134.setFont(local8);
							local134.setColor(Color.white);
							local134.drawString(local186, (this.anInt4813 - local12.stringWidth(local186)) / 2, this.anInt4812 / 2 + 4);
						}
					} catch (@Pc(211) Exception local211) {
					}
				}
			}
			local61.close();
		} catch (@Pc(217) IOException local217) {
			return null;
		}
		return this.method3349(arg2, local20) ? local20 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I[B)Z")
	private boolean method3349(@OriginalArg(0) String arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(7) MessageDigest local7 = MessageDigest.getInstance("SHA");
			local7.reset();
			local7.update(arg1);
			@Pc(20) byte[] local20 = local7.digest();
			if (arg0 == "runescape_-105854972.pack200") {
				if (local20[0] != 110 || local20[1] != -111 || local20[2] != 3 || local20[3] != 4 || local20[4] != 89 || local20[5] != 97 || local20[6] != 118 || local20[7] != 76 || local20[8] != 1 || local20[9] != 44 || local20[10] != 49 || local20[11] != 48 || local20[12] != 66 || local20[13] != -126 || local20[14] != -1 || local20[15] != 118 || local20[16] != 117 || local20[17] != -78 || local20[18] != 22 || local20[19] != -73) {
					return false;
				}
			} else if (arg0 == "runescape_472596340.js5") {
				if (local20[0] != -78 || local20[1] != -42 || local20[2] != -76 || local20[3] != -11 || local20[4] != -99 || local20[5] != 120 || local20[6] != 15 || local20[7] != 80 || local20[8] != -45 || local20[9] != 1 || local20[10] != -37 || local20[11] != 95 || local20[12] != 124 || local20[13] != -71 || local20[14] != -80 || local20[15] != -70 || local20[16] != 111 || local20[17] != 1 || local20[18] != 104 || local20[19] != 47) {
					return false;
				}
			} else if (arg0 == "unpackclass_-462058432.pack") {
				if (local20[0] != 88 || local20[1] != 0 || local20[2] != -7 || local20[3] != -109 || local20[4] != 43 || local20[5] != -100 || local20[6] != -104 || local20[7] != 7 || local20[8] != -25 || local20[9] != 69 || local20[10] != 28 || local20[11] != 18 || local20[12] != 106 || local20[13] != 112 || local20[14] != 33 || local20[15] != 50 || local20[16] != 123 || local20[17] != -108 || local20[18] != -80 || local20[19] != 35) {
					return false;
				}
			} else if (arg0 == "jogltrimmed_1781997114.pack") {
				if (local20[0] != 80 || local20[1] != -79 || local20[2] != 53 || local20[3] != -96 || local20[4] != -14 || local20[5] != -48 || local20[6] != 124 || local20[7] != 78 || local20[8] != -128 || local20[9] != 103 || local20[10] != -103 || local20[11] != -39 || local20[12] != 55 || local20[13] != 108 || local20[14] != -14 || local20[15] != 55 || local20[16] != -126 || local20[17] != -45 || local20[18] != 22 || local20[19] != -50) {
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
		} catch (@Pc(788) Exception local788) {
			this.method3347("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean297 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/io/File;)Z")
	private boolean method3350(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method3347("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean294 = true;
		this.aBoolean295 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/io/File;I)[B")
	private byte[] method3351(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) File arg2, @OriginalArg(4) int arg3) {
		@Pc(10) byte[] local10 = this.method3352(arg2);
		if (!this.method3349(arg0, local10)) {
			local10 = this.method3348(false, arg1, arg0, arg3);
			if (local10 == null) {
				local10 = this.method3348(true, arg1, arg0, arg3);
			}
			if (local10 == null) {
				this.method3347("download");
				return null;
			}
			if (!this.method3350(local10, arg2)) {
				return null;
			}
			local10 = this.method3352(arg2);
			if (!this.method3349(arg0, local10)) {
				this.method3347("mismatch");
				return null;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method3352(@OriginalArg(0) File arg0) {
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
		} catch (@Pc(45) IOException local45) {
			return null;
		}
	}
}
