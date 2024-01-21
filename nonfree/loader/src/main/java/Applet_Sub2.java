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
	private int anInt2967;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt2968;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Lloader!tc;")
	private Class85 aClass85_1;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean134;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method2069(@OriginalArg(0) String arg0) {
		if (this.aBoolean134) {
			return;
		}
		this.aBoolean134 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(33) Exception local33) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method2070(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(20) DataInputStream local20 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(23) byte[] local23 = new byte[local9];
			local20.readFully(local23, 0, local9);
			local20.close();
			return local23;
		} catch (@Pc(33) IOException local33) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/io/File;)Z")
	private boolean method2071(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method2069("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;IZLjava/lang/String;)[B")
	private byte[] method2072(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(20) byte[] local20 = new byte[arg1];
		try {
			@Pc(67) InputStream local67;
			if (arg2) {
				@Pc(31) URL local31 = this.getCodeBase();
				@Pc(39) Socket local39 = new Socket(InetAddress.getByName(local31.getHost()), 443);
				local39.setSoTimeout(10000);
				@Pc(45) OutputStream local45 = local39.getOutputStream();
				local45.write(17);
				local45.write(("JAGGRAB " + local31.getFile() + arg0 + "\n\n").getBytes());
				local67 = local39.getInputStream();
			} else {
				local67 = (new URL(this.getCodeBase(), arg0)).openStream();
			}
			@Pc(79) int local79 = -1;
			@Pc(81) int local81 = 0;
			while (local81 < local20.length) {
				@Pc(91) int local91 = local20.length - local81;
				if (local91 > 1000) {
					local91 = 1000;
				}
				@Pc(103) int local103 = local67.read(local20, local81, local91);
				if (local103 < 0) {
					throw new EOFException();
				}
				local81 += local103;
				@Pc(124) int local124 = local81 * 100 / local20.length;
				if (local79 != local124) {
					try {
						@Pc(131) Graphics local131 = this.getGraphics();
						if (local131 == null) {
							this.repaint();
						} else {
							local131.setColor(Color.black);
							local131.fillRect(0, 0, this.anInt2967, this.anInt2968);
							local131.setColor(local17);
							local79 = local124;
							local131.drawRect(this.anInt2967 / 2 - 152, this.anInt2968 / 2 + -18, 303, 33);
							local131.setFont(local8);
							local131.setColor(Color.white);
							@Pc(184) String local184 = arg3 + " - " + local124 + "%";
							local131.drawString(local184, (this.anInt2967 - local12.stringWidth(local184)) / 2, this.anInt2968 / 2 + 4);
						}
					} catch (@Pc(207) Exception local207) {
					}
				}
			}
			local67.close();
		} catch (@Pc(213) IOException local213) {
			return null;
		}
		return this.method2073(local20, arg0) ? local20 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/lang/String;I)Z")
	private boolean method2073(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(11) MessageDigest local11 = MessageDigest.getInstance("SHA");
			local11.reset();
			local11.update(arg0);
			@Pc(19) byte[] local19 = local11.digest();
			if (arg1 == "runescape_-315089751.pack200") {
				if (local19[0] != 74 || local19[1] != 57 || local19[2] != -17 || local19[3] != -100 || local19[4] != -13 || local19[5] != -55 || local19[6] != -17 || local19[7] != 27 || local19[8] != -47 || local19[9] != -77 || local19[10] != 87 || local19[11] != 114 || local19[12] != -33 || local19[13] != 57 || local19[14] != -17 || local19[15] != 5 || local19[16] != 72 || local19[17] != 111 || local19[18] != 50 || local19[19] != -47) {
					return false;
				}
			} else if (arg1 == "runescape_958005245.js5") {
				if (local19[0] != -54 || local19[1] != -108 || local19[2] != -13 || local19[3] != -122 || local19[4] != 92 || local19[5] != -4 || local19[6] != 118 || local19[7] != 110 || local19[8] != -16 || local19[9] != 13 || local19[10] != 7 || local19[11] != 67 || local19[12] != 9 || local19[13] != -70 || local19[14] != 125 || local19[15] != 54 || local19[16] != 40 || local19[17] != 13 || local19[18] != -90 || local19[19] != -100) {
					return false;
				}
			} else if (local19[0] != 3 || local19[1] != -21 || local19[2] != 65 || local19[3] != -60 || local19[4] != -33 || local19[5] != -24 || local19[6] != 92 || local19[7] != 4 || local19[8] != -2 || local19[9] != 48 || local19[10] != 106 || local19[11] != 50 || local19[12] != -46 || local19[13] != -31 || local19[14] != -44 || local19[15] != 120 || local19[16] != -104 || local19[17] != 72 || local19[18] != 50 || local19[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(395) Exception local395) {
			this.method2069("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;BLjava/lang/String;Ljava/lang/String;I)[B")
	private byte[] method2074(@OriginalArg(0) File arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(10) byte[] local10 = this.method2070(arg0);
		if (!this.method2073(local10, arg1)) {
			local10 = this.method2072(arg1, arg3, false, arg2);
			if (local10 == null) {
				local10 = this.method2072(arg1, arg3, true, arg2);
			}
			if (local10 == null) {
				this.method2069("download");
				return null;
			}
			if (!this.method2071(local10, arg0)) {
				return null;
			}
			local10 = this.method2070(arg0);
			if (!this.method2073(local10, arg1)) {
				this.method2069("mismatch");
				return null;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt2967 = Integer.parseInt(this.getParameter("width"));
			this.anInt2968 = Integer.parseInt(this.getParameter("height"));
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
					local26 = "Lade Spiel-Code";
					local28 = "Lade Entpacker";
				}
			} catch (@Pc(45) Exception local45) {
			}
			try {
				this.aClass85_1 = new Class85(true, this, local13, "runescape", 16);
			} catch (@Pc(57) Exception local57) {
				this.method2069("nocache");
				return;
			}
			@Pc(68) ClassLoader_Sub1 local68 = new ClassLoader_Sub1();
			@Pc(85) byte[] local85;
			try {
				Class.forName("java.util.jar.Pack200");
				local85 = this.method2074(new File(this.aClass85_1.aFile6, "main_file_cache.dat0"), "runescape_-315089751.pack200", local26, 243307);
				if (local85 == null) {
					return;
				}
				local68.aClass83_1 = new Class83_Sub1(local85);
			} catch (@Pc(96) Throwable local96) {
			}
			@Pc(126) Class local126;
			if (local68.aClass83_1 == null) {
				local85 = this.method2074(new File(this.aClass85_1.aFile6, "game_unpacker.dat"), "unpackclass_-549807395.jar", local28, 17836);
				if (local85 == null) {
					return;
				}
				local68.aClass83_1 = new Class83(local85);
				local126 = Class.forName("Class83");
				local68.aHashtable1.put(local126.getName(), local126);
				@Pc(137) Class local137 = local68.loadClass("unpackclass");
				local68 = new ClassLoader_Sub1();
				local85 = this.method2074(new File(this.aClass85_1.aFile6, "main_file_cache.dat1"), "runescape_958005245.js5", local26, 257080);
				if (local85 == null) {
					return;
				}
				local68.aClass83_1 = (Class83) local137.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local85, Boolean.TRUE);
			}
			local126 = Class.forName("Class82");
			local68.aHashtable1.put(local126.getName(), local126);
			@Pc(199) Class local199 = Class.forName("Class85");
			local68.aHashtable1.put(local199.getName(), local199);
			local126 = Class.forName("Class84");
			local68.aHashtable1.put(local126.getName(), local126);
			local126 = Class.forName("Interface4");
			local68.aHashtable1.put(local126.getName(), local126);
			local126 = local68.loadClass("client");
			this.anApplet2 = (Applet) local126.getDeclaredConstructor().newInstance();
			local126.getMethod("providesignlink", local199).invoke(null, this.aClass85_1);
			this.anApplet2.init();
			this.anApplet2.start();
		} catch (@Pc(262) Exception local262) {
			RuntimeException_Sub2.anInt2963 = 958005245;
			if (local262 instanceof InvocationTargetException) {
				@Pc(271) Throwable local271 = ((InvocationTargetException) local262).getTargetException();
				if (local271 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2053(this, local262.toString(), local271);
			} else {
				RuntimeException_Sub2.method2053(this, null, local262);
			}
			this.method2069("crash");
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
	public void destroy() {
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}
}
