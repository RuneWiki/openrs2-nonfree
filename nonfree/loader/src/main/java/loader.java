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

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt4750;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt4751;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean268 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean269 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean270 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean271 = false;

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt4751 = Integer.parseInt(this.getParameter("width"));
			this.anInt4750 = Integer.parseInt(this.getParameter("height"));
			@Pc(13) int local13 = 32;
			try {
				@Pc(18) int local18 = Integer.parseInt(this.getParameter("modewhat"));
				local13 += local18;
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
			} catch (@Pc(46) Exception local46) {
			}
			@Pc(55) Class111 local55;
			try {
				local55 = new Class111(true, this, local13, "runescape", 27);
			} catch (@Pc(57) Exception local57) {
				this.method3545("nocache");
				return;
			}
			@Pc(66) ClassLoader_Sub1 local66 = new ClassLoader_Sub1();
			try {
				Class.forName("java.util.jar.Pack200");
				@Pc(71) String local71 = "main_file_cache.dat0";
				@Pc(84) byte[] local84 = this.method3547(new File(local55.aFile5, local71), local26, "runescape_-1440418078.pack200", 330538);
				if (local84 == null) {
					return;
				}
				local66.anUnpack1 = new unpack_Sub1(local84);
			} catch (@Pc(95) Throwable local95) {
			}
			if (local66.anUnpack1 == null) {
				@Pc(111) byte[] local111 = this.method3547(new File(local55.aFile5, "game_unpacker.dat"), local28, "unpackclass_-462058432.pack", 19590);
				if (local111 == null) {
					return;
				}
				@Pc(118) ClassLoader_Sub1 local118 = new ClassLoader_Sub1();
				@Pc(120) String local120 = "main_file_cache.dat1";
				local118.anUnpack1 = new unpack(local111);
				@Pc(129) Class local129 = Class.forName("unpack");
				local118.aHashtable1.put(local129.getName(), local129);
				@Pc(140) Class local140 = local118.loadClass("unpackclass");
				local111 = this.method3547(new File(local55.aFile5, local120), local26, "runescape_-765247651.js5", 338984);
				if (local111 == null) {
					return;
				}
				local66.anUnpack1 = (unpack) local140.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local111, Boolean.TRUE);
			}
			@Pc(187) Class local187 = Class.forName("Class110");
			local66.aHashtable1.put(local187.getName(), local187);
			@Pc(197) Class local197 = Class.forName("Class111");
			local66.aHashtable1.put(local197.getName(), local197);
			@Pc(207) Class local207 = Class.forName("Class109");
			local66.aHashtable1.put(local207.getName(), local207);
			@Pc(217) Class local217 = Class.forName("Interface5");
			local66.aHashtable1.put(local217.getName(), local217);
			@Pc(228) Class local228 = local66.loadClass("client");
			synchronized (this) {
				if (this.aBoolean268) {
					return;
				}
				this.anApplet2 = (Applet) local228.getDeclaredConstructor().newInstance();
				local228.getMethod("providesignlink", local197).invoke(null, local55);
				this.anApplet2.init();
				if (this.aBoolean270) {
					this.anApplet2.start();
				}
				if (this.aBoolean269) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(287) Exception local287) {
			RuntimeException_Sub2.anInt4745 = -765247651;
			if (local287 instanceof InvocationTargetException) {
				@Pc(296) Throwable local296 = ((InvocationTargetException) local287).getTargetException();
				if (local296 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method3534(local296, local287.toString(), this);
			} else {
				RuntimeException_Sub2.method3534(local287, null, this);
			}
			this.method3545("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method3545(@OriginalArg(1) String arg0) {
		if (this.aBoolean271) {
			return;
		}
		this.aBoolean271 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(31) Exception local31) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B[BLjava/lang/String;)Z")
	private boolean method3546(@OriginalArg(1) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(6) MessageDigest local6 = MessageDigest.getInstance("SHA");
			local6.reset();
			local6.update(arg0);
			@Pc(14) byte[] local14 = local6.digest();
			if (arg1 == "runescape_-1440418078.pack200") {
				if (local14[0] != 116 || local14[1] != 95 || local14[2] != 108 || local14[3] != 103 || local14[4] != 4 || local14[5] != -59 || local14[6] != 111 || local14[7] != -113 || local14[8] != -10 || local14[9] != -117 || local14[10] != 16 || local14[11] != 117 || local14[12] != 71 || local14[13] != -1 || local14[14] != -92 || local14[15] != 12 || local14[16] != 16 || local14[17] != 90 || local14[18] != 22 || local14[19] != -77) {
					return false;
				}
			} else if (arg1 == "runescape_-765247651.js5") {
				if (local14[0] != 0 || local14[1] != -9 || local14[2] != -89 || local14[3] != -63 || local14[4] != 15 || local14[5] != 22 || local14[6] != -71 || local14[7] != 5 || local14[8] != 29 || local14[9] != -108 || local14[10] != -65 || local14[11] != 85 || local14[12] != -15 || local14[13] != 45 || local14[14] != 13 || local14[15] != -123 || local14[16] != -59 || local14[17] != 95 || local14[18] != 4 || local14[19] != -109) {
					return false;
				}
			} else if (arg1 == "unpackclass_-462058432.pack") {
				if (local14[0] != 88 || local14[1] != 0 || local14[2] != -7 || local14[3] != -109 || local14[4] != 43 || local14[5] != -100 || local14[6] != -104 || local14[7] != 7 || local14[8] != -25 || local14[9] != 69 || local14[10] != 28 || local14[11] != 18 || local14[12] != 106 || local14[13] != 112 || local14[14] != 33 || local14[15] != 50 || local14[16] != 123 || local14[17] != -108 || local14[18] != -80 || local14[19] != 35) {
					return false;
				}
			} else if (arg1 == "jogl_181740960.pack") {
				if (local14[0] != 74 || local14[1] != 7 || local14[2] != -54 || local14[3] != 86 || local14[4] != 3 || local14[5] != 113 || local14[6] != -45 || local14[7] != -123 || local14[8] != 63 || local14[9] != 97 || local14[10] != 69 || local14[11] != -41 || local14[12] != -121 || local14[13] != 126 || local14[14] != -30 || local14[15] != -32 || local14[16] != 33 || local14[17] != -122 || local14[18] != -111 || local14[19] != 63) {
					return false;
				}
			} else if (arg1 == "jogl_-1134983286.dll") {
				if (local14[0] != 43 || local14[1] != 73 || local14[2] != -119 || local14[3] != -99 || local14[4] != -19 || local14[5] != 109 || local14[6] != -62 || local14[7] != 40 || local14[8] != 41 || local14[9] != -91 || local14[10] != -88 || local14[11] != -50 || local14[12] != -38 || local14[13] != -127 || local14[14] != -126 || local14[15] != 33 || local14[16] != -93 || local14[17] != -95 || local14[18] != -123 || local14[19] != 66) {
					return false;
				}
			} else if (arg1 == "jogl_awt_-532687481.dll" && (local14[0] != -26 || local14[1] != 91 || local14[2] != -12 || local14[3] != -87 || local14[4] != 122 || local14[5] != -5 || local14[6] != 108 || local14[7] != 94 || local14[8] != 20 || local14[9] != 111 || local14[10] != 116 || local14[11] != -56 || local14[12] != -10 || local14[13] != 66 || local14[14] != -92 || local14[15] != -125 || local14[16] != -41 || local14[17] != 70 || local14[18] != 81 || local14[19] != -71)) {
				return false;
			}
			return true;
		} catch (@Pc(798) Exception local798) {
			this.method3545("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean268 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;IZ)[B")
	private byte[] method3547(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		@Pc(4) byte[] local4 = this.method3550(arg0);
		if (!this.method3546(local4, arg2)) {
			local4 = this.method3548(arg1, false, arg2, arg3);
			if (local4 == null) {
				local4 = this.method3548(arg1, true, arg2, arg3);
			}
			if (local4 == null) {
				this.method3545("download");
				return null;
			}
			if (!this.method3549(arg0, local4)) {
				return null;
			}
			local4 = this.method3550(arg0);
			if (!this.method3546(local4, arg2)) {
				this.method3545("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean270 = false;
		this.aBoolean269 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;II)[B")
	private byte[] method3548(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		@Pc(16) Font local16 = new Font("Helvetica", 1, 13);
		@Pc(20) FontMetrics local20 = this.getFontMetrics(local16);
		@Pc(23) byte[] local23 = new byte[arg3];
		@Pc(28) Color local28 = new Color(9179409);
		try {
			@Pc(69) InputStream local69;
			if (arg1) {
				@Pc(33) URL local33 = this.getCodeBase();
				@Pc(41) Socket local41 = new Socket(InetAddress.getByName(local33.getHost()), 443);
				local41.setSoTimeout(10000);
				@Pc(47) OutputStream local47 = local41.getOutputStream();
				local47.write(17);
				local47.write(("JAGGRAB " + local33.getFile() + arg2 + "\n\n").getBytes());
				local69 = local41.getInputStream();
			} else {
				local69 = (new URL(this.getCodeBase(), arg2)).openStream();
			}
			@Pc(81) int local81 = -1;
			@Pc(83) int local83 = 0;
			while (local83 < local23.length) {
				@Pc(96) int local96 = local23.length - local83;
				if (local96 > 1000) {
					local96 = 1000;
				}
				@Pc(108) int local108 = local69.read(local23, local83, local96);
				if (local108 < 0) {
					throw new EOFException();
				}
				local83 += local108;
				@Pc(126) int local126 = local83 * 100 / local23.length;
				if (local126 != local81) {
					try {
						@Pc(136) Graphics local136 = this.getGraphics();
						if (local136 == null) {
							this.repaint();
						} else {
							local136.setColor(Color.black);
							@Pc(155) String local155 = arg0 + " - " + local126 + "%";
							local136.fillRect(0, 0, this.anInt4751, this.anInt4750);
							local81 = local126;
							local136.setColor(local28);
							local136.drawRect(this.anInt4751 / 2 - 152, this.anInt4750 / 2 - 18, 303, 33);
							local136.setFont(local16);
							local136.setColor(Color.white);
							local136.drawString(local155, (this.anInt4751 - local20.stringWidth(local155)) / 2, this.anInt4750 / 2 + 4);
						}
					} catch (@Pc(213) Exception local213) {
					}
				}
			}
			local69.close();
		} catch (@Pc(219) IOException local219) {
			return null;
		}
		return this.method3546(local23, arg2) ? local23 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean270 = this.aBoolean269 = false;
		this.aBoolean268 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	private boolean method3549(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method3545("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method3550(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(29) DataInputStream local29 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(32) byte[] local32 = new byte[local9];
			local29.readFully(local32, 0, local9);
			local29.close();
			return local32;
		} catch (@Pc(42) IOException local42) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean269 = false;
		this.aBoolean270 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}
}
