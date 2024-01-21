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

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Lloader!ba;")
	private Class80 aClass80_1;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt3340;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt3341;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean189;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Z[B)Z")
	private boolean method2209(@OriginalArg(0) String arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(6) MessageDigest local6 = MessageDigest.getInstance("SHA");
			local6.reset();
			local6.update(arg1);
			@Pc(19) byte[] local19 = local6.digest();
			if (arg0 == "runescape.pack200?crc=2070883689") {
				if (local19[0] != -108 || local19[1] != 6 || local19[2] != 78 || local19[3] != -96 || local19[4] != -20 || local19[5] != 55 || local19[6] != 2 || local19[7] != 120 || local19[8] != 39 || local19[9] != -78 || local19[10] != 14 || local19[11] != 110 || local19[12] != 0 || local19[13] != -18 || local19[14] != -1 || local19[15] != -48 || local19[16] != -59 || local19[17] != -51 || local19[18] != -9 || local19[19] != -19) {
					return false;
				}
			} else if (arg0 == "runescape.js5?crc=-1328573124") {
				if (local19[0] != 41 || local19[1] != 35 || local19[2] != -1 || local19[3] != 123 || local19[4] != -128 || local19[5] != -102 || local19[6] != 20 || local19[7] != 74 || local19[8] != 124 || local19[9] != -52 || local19[10] != 95 || local19[11] != -52 || local19[12] != 122 || local19[13] != 122 || local19[14] != 67 || local19[15] != -77 || local19[16] != -114 || local19[17] != -95 || local19[18] != 73 || local19[19] != -79) {
					return false;
				}
			} else if (local19[0] != 3 || local19[1] != -21 || local19[2] != 65 || local19[3] != -60 || local19[4] != -33 || local19[5] != -24 || local19[6] != 92 || local19[7] != 4 || local19[8] != -2 || local19[9] != 48 || local19[10] != 106 || local19[11] != 50 || local19[12] != -46 || local19[13] != -31 || local19[14] != -44 || local19[15] != 120 || local19[16] != -104 || local19[17] != 72 || local19[18] != 50 || local19[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(387) Exception local387) {
			this.method2211("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt3341 = Integer.parseInt(this.getParameter("width"));
			this.anInt3340 = Integer.parseInt(this.getParameter("height"));
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
			try {
				this.aClass80_1 = new Class80(true, this, InetAddress.getByName(this.getCodeBase().getHost()), local13, "runescape", 16);
			} catch (@Pc(62) Exception local62) {
				this.method2211("nocache");
				return;
			}
			@Pc(73) ClassLoader_Sub1 local73 = new ClassLoader_Sub1();
			@Pc(90) byte[] local90;
			try {
				Class.forName("java.util.jar.Pack200");
				local90 = this.method2213(local26, 234438, "runescape.pack200?crc=2070883689", new File(this.aClass80_1.aFile5, "main_file_cache.dat0"));
				if (local90 == null) {
					return;
				}
				local73.aClass79_1 = new Class79_Sub1(local90);
			} catch (@Pc(102) Throwable local102) {
			}
			@Pc(132) Class local132;
			if (local73.aClass79_1 == null) {
				local90 = this.method2213(local28, 17836, "unpackclass.jar?crc=-549807395", new File(this.aClass80_1.aFile5, "game_unpacker.dat"));
				if (local90 == null) {
					return;
				}
				local73.aClass79_1 = new Class79(local90);
				local132 = Class.forName("Class79");
				local73.aHashtable1.put(local132.getName(), local132);
				@Pc(143) Class local143 = local73.loadClass("unpackclass");
				local73 = new ClassLoader_Sub1();
				local90 = this.method2213(local26, 249269, "runescape.js5?crc=-1328573124", new File(this.aClass80_1.aFile5, "main_file_cache.dat1"));
				if (local90 == null) {
					return;
				}
				local73.aClass79_1 = (Class79) local143.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local90, Boolean.TRUE);
			}
			local132 = Class.forName("Class81");
			local73.aHashtable1.put(local132.getName(), local132);
			@Pc(204) Class local204 = Class.forName("Class80");
			local73.aHashtable1.put(local204.getName(), local204);
			local132 = Class.forName("Class82");
			local73.aHashtable1.put(local132.getName(), local132);
			local132 = Class.forName("Interface4");
			local73.aHashtable1.put(local132.getName(), local132);
			local132 = local73.loadClass("client");
			this.anApplet3 = (Applet) local132.getDeclaredConstructor().newInstance();
			local132.getMethod("providesignlink", local204).invoke(null, this.aClass80_1);
			this.anApplet3.init();
			this.anApplet3.start();
		} catch (@Pc(267) Exception local267) {
			RuntimeException_Sub2.anInt3336 = -1328573124;
			if (local267 instanceof InvocationTargetException) {
				@Pc(283) Throwable local283 = ((InvocationTargetException) local267).getTargetException();
				if (local283 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2207(local267.toString(), local283, this);
			} else {
				RuntimeException_Sub2.method2207(null, local267, this);
			}
			this.method2211("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;II)[B")
	private byte[] method2210(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(20) byte[] local20 = new byte[arg3];
		try {
			@Pc(66) InputStream local66;
			if (arg0) {
				@Pc(30) URL local30 = this.getCodeBase();
				@Pc(38) Socket local38 = new Socket(InetAddress.getByName(local30.getHost()), 443);
				local38.setSoTimeout(10000);
				@Pc(44) OutputStream local44 = local38.getOutputStream();
				local44.write(17);
				local44.write(("JAGGRAB " + local30.getFile() + arg2 + "\n\n").getBytes());
				local66 = local38.getInputStream();
			} else {
				local66 = (new URL(this.getCodeBase(), arg2)).openStream();
			}
			@Pc(78) int local78 = -1;
			@Pc(80) int local80 = 0;
			while (local80 < local20.length) {
				@Pc(90) int local90 = local20.length - local80;
				if (local90 > 1000) {
					local90 = 1000;
				}
				@Pc(101) int local101 = local66.read(local20, local80, local90);
				if (local101 < 0) {
					throw new EOFException();
				}
				local80 += local101;
				@Pc(119) int local119 = local80 * 100 / local20.length;
				if (local119 != local78) {
					try {
						@Pc(130) Graphics local130 = this.getGraphics();
						if (local130 == null) {
							this.repaint();
						} else {
							local130.setColor(Color.black);
							local130.fillRect(0, 0, this.anInt3341, this.anInt3340);
							local130.setColor(local17);
							local78 = local119;
							@Pc(166) String local166 = arg1 + " - " + local119 + "%";
							local130.drawRect(this.anInt3341 / 2 - 152, this.anInt3340 / 2 + -18, 303, 33);
							local130.setFont(local8);
							local130.setColor(Color.white);
							local130.drawString(local166, (this.anInt3341 - local12.stringWidth(local166)) / 2, this.anInt3340 / 2 + 4);
						}
					} catch (@Pc(207) Exception local207) {
					}
				}
			}
			local66.close();
		} catch (@Pc(213) IOException local213) {
			return null;
		}
		return this.method2209(arg2, local20) ? local20 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method2211(@OriginalArg(1) String arg0) {
		if (this.aBoolean189) {
			return;
		}
		this.aBoolean189 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(33) Exception local33) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method2212(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(14) int local14 = (int) arg0.length();
			@Pc(25) DataInputStream local25 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(28) byte[] local28 = new byte[local14];
			local25.readFully(local28, 0, local14);
			local25.close();
			return local28;
		} catch (@Pc(38) IOException local38) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;Ljava/io/File;)[B")
	private byte[] method2213(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) File arg3) {
		@Pc(4) byte[] local4 = this.method2212(arg3);
		if (!this.method2209(arg2, local4)) {
			local4 = this.method2210(false, arg0, arg2, arg1);
			if (local4 == null) {
				local4 = this.method2210(true, arg0, arg2, arg1);
			}
			if (local4 == null) {
				this.method2211("download");
				return null;
			}
			if (!this.method2214(local4, arg3)) {
				return null;
			}
			local4 = this.method2212(arg3);
			if (!this.method2209(arg2, local4)) {
				this.method2211("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BILjava/io/File;)Z")
	private boolean method2214(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			this.method2211("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}
}
