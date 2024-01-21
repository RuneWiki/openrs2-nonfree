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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt3029;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Lloader!ha;")
	private Class74 aClass74_1;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt3030;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean135;

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;[B)Z")
	private boolean method2083(@OriginalArg(1) String arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(14) MessageDigest local14 = MessageDigest.getInstance("SHA");
			local14.reset();
			local14.update(arg1);
			@Pc(22) byte[] local22 = local14.digest();
			if (arg0 == "runescape.pack200?crc=-320935655") {
				if (local22[0] != -6 || local22[1] != -33 || local22[2] != -104 || local22[3] != 46 || local22[4] != -94 || local22[5] != -36 || local22[6] != -117 || local22[7] != -91 || local22[8] != -23 || local22[9] != -73 || local22[10] != 96 || local22[11] != -60 || local22[12] != 30 || local22[13] != 53 || local22[14] != 96 || local22[15] != -82 || local22[16] != 29 || local22[17] != 122 || local22[18] != 13 || local22[19] != 25) {
					return false;
				}
			} else if (arg0 == "runescape.js5?crc=1467407811") {
				if (local22[0] != 36 || local22[1] != 101 || local22[2] != 83 || local22[3] != -1 || local22[4] != -66 || local22[5] != -14 || local22[6] != -76 || local22[7] != 54 || local22[8] != 58 || local22[9] != 105 || local22[10] != -84 || local22[11] != 97 || local22[12] != 57 || local22[13] != -37 || local22[14] != -3 || local22[15] != -87 || local22[16] != -120 || local22[17] != 59 || local22[18] != 101 || local22[19] != 23) {
					return false;
				}
			} else if (local22[0] != 3 || local22[1] != -21 || local22[2] != 65 || local22[3] != -60 || local22[4] != -33 || local22[5] != -24 || local22[6] != 92 || local22[7] != 4 || local22[8] != -2 || local22[9] != 48 || local22[10] != 106 || local22[11] != 50 || local22[12] != -46 || local22[13] != -31 || local22[14] != -44 || local22[15] != 120 || local22[16] != -104 || local22[17] != 72 || local22[18] != 50 || local22[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(410) Exception local410) {
			this.method2086("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;BLjava/io/File;ILjava/lang/String;)[B")
	private byte[] method2084(@OriginalArg(0) String arg0, @OriginalArg(2) File arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(4) byte[] local4 = this.method2085(arg1);
		if (!this.method2083(arg3, local4)) {
			local4 = this.method2088(arg2, arg0, false, arg3);
			if (local4 == null) {
				local4 = this.method2088(arg2, arg0, true, arg3);
			}
			if (local4 == null) {
				this.method2086("download");
				return null;
			}
			if (!this.method2087(local4, arg1)) {
				return null;
			}
			local4 = this.method2085(arg1);
			if (!this.method2083(arg3, local4)) {
				this.method2086("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(1) int local1 = 32;
			this.anInt3030 = Integer.parseInt(this.getParameter("width"));
			this.anInt3029 = Integer.parseInt(this.getParameter("height"));
			try {
				@Pc(18) int local18 = Integer.parseInt(this.getParameter("modewhat"));
				local1 += local18;
			} catch (@Pc(24) Exception local24) {
			}
			@Pc(26) String local26 = "Loading game code";
			@Pc(28) String local28 = "Loading unpacker";
			try {
				@Pc(32) String local32 = this.getParameter("lang");
				if (local32 != null && local32.equals("1")) {
					local26 = "Lade Spiel-Code";
					local28 = "Lade Entpacker";
				}
			} catch (@Pc(45) Exception local45) {
			}
			try {
				this.aClass74_1 = new Class74(true, this, InetAddress.getByName(this.getCodeBase().getHost()), local1, "runescape", 14);
			} catch (@Pc(61) Exception local61) {
				this.method2086("nocache");
				return;
			}
			@Pc(72) ClassLoader_Sub1 local72 = new ClassLoader_Sub1();
			@Pc(89) byte[] local89;
			try {
				Class.forName("java.util.jar.Pack200");
				local89 = this.method2084(local26, new File(this.aClass74_1.aFile5, "main_file_cache.dat0"), 221240, "runescape.pack200?crc=-320935655");
				if (local89 == null) {
					return;
				}
				local72.aClass73_1 = new Class73_Sub1(local89);
			} catch (@Pc(101) Throwable local101) {
			}
			@Pc(132) Class local132;
			if (local72.aClass73_1 == null) {
				local89 = this.method2084(local28, new File(this.aClass74_1.aFile5, "game_unpacker.dat"), 17836, "unpackclass.jar?crc=-549807395");
				if (local89 == null) {
					return;
				}
				local72.aClass73_1 = new Class73(local89);
				local132 = Class.forName("Class73");
				local72.aHashtable1.put(local132.getName(), local132);
				@Pc(143) Class local143 = local72.loadClass("unpackclass");
				local72 = new ClassLoader_Sub1();
				local89 = this.method2084(local26, new File(this.aClass74_1.aFile5, "main_file_cache.dat1"), 236994, "runescape.js5?crc=1467407811");
				if (local89 == null) {
					return;
				}
				local72.aClass73_1 = (Class73) local143.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local89, Boolean.TRUE);
			}
			local132 = Class.forName("Class75");
			local72.aHashtable1.put(local132.getName(), local132);
			@Pc(205) Class local205 = Class.forName("Class74");
			local72.aHashtable1.put(local205.getName(), local205);
			local132 = Class.forName("Class76");
			local72.aHashtable1.put(local132.getName(), local132);
			local132 = Class.forName("Interface6");
			local72.aHashtable1.put(local132.getName(), local132);
			local132 = Class.forName("Interface5");
			local72.aHashtable1.put(local132.getName(), local132);
			local132 = local72.loadClass("client");
			this.anApplet3 = (Applet) local132.getDeclaredConstructor().newInstance();
			local132.getMethod("providesignlink", local205).invoke(null, this.aClass74_1);
			this.anApplet3.init();
			this.anApplet3.start();
		} catch (@Pc(278) Exception local278) {
			RuntimeException_Sub2.anInt3025 = 1467407811;
			if (local278 instanceof InvocationTargetException) {
				@Pc(294) Throwable local294 = ((InvocationTargetException) local278).getTargetException();
				if (local294 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2060(this, local294, local278.toString());
			} else {
				RuntimeException_Sub2.method2060(this, local278, null);
			}
			this.method2086("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;B)[B")
	private byte[] method2085(@OriginalArg(0) File arg0) {
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
		} catch (@Pc(44) IOException local44) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method2086(@OriginalArg(1) String arg0) {
		if (this.aBoolean135) {
			return;
		}
		this.aBoolean135 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(33) Exception local33) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BBLjava/io/File;)Z")
	private boolean method2087(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method2086("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;ZLjava/lang/String;)[B")
	private byte[] method2088(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(18) FontMetrics local18 = this.getFontMetrics(local8);
		@Pc(21) byte[] local21 = new byte[arg0];
		@Pc(26) Color local26 = new Color(9179409);
		try {
			@Pc(67) InputStream local67;
			if (arg2) {
				@Pc(31) URL local31 = this.getCodeBase();
				@Pc(39) Socket local39 = new Socket(InetAddress.getByName(local31.getHost()), 443);
				local39.setSoTimeout(10000);
				@Pc(45) OutputStream local45 = local39.getOutputStream();
				local45.write(17);
				local45.write(("JAGGRAB " + local31.getFile() + arg3 + "\n\n").getBytes());
				local67 = local39.getInputStream();
			} else {
				local67 = (new URL(this.getCodeBase(), arg3)).openStream();
			}
			@Pc(79) int local79 = 0;
			@Pc(81) int local81 = -1;
			while (local21.length > local79) {
				@Pc(94) int local94 = local21.length - local79;
				if (local94 > 1000) {
					local94 = 1000;
				}
				@Pc(107) int local107 = local67.read(local21, local79, local94);
				if (local107 < 0) {
					throw new EOFException();
				}
				local79 += local107;
				@Pc(126) int local126 = local79 * 100 / local21.length;
				if (local81 != local126) {
					try {
						@Pc(132) Graphics local132 = this.getGraphics();
						if (local132 == null) {
							this.repaint();
						} else {
							local132.setColor(Color.black);
							local132.fillRect(0, 0, this.anInt3030, this.anInt3029);
							@Pc(162) String local162 = arg1 + " - " + local126 + "%";
							local132.setColor(local26);
							local81 = local126;
							local132.drawRect(this.anInt3030 / 2 - 152, this.anInt3029 / 2 + -18, 303, 33);
							local132.setFont(local8);
							local132.setColor(Color.white);
							local132.drawString(local162, (this.anInt3030 - local18.stringWidth(local162)) / 2, this.anInt3029 / 2 + 4);
						}
					} catch (@Pc(208) Exception local208) {
					}
				}
			}
			local67.close();
		} catch (@Pc(214) IOException local214) {
			return null;
		}
		return this.method2083(arg3, local21) ? local21 : null;
	}
}
