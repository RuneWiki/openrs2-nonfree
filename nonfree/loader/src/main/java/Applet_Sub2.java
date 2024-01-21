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
	private int anInt2963;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt2964;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Lloader!bb;")
	private Class85 aClass85_1;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean122;

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
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

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;Z[B)Z")
	private boolean method2079(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method2082("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method2080(@OriginalArg(0) File arg0) {
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
		} catch (@Pc(40) IOException local40) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/lang/String;B)Z")
	private boolean method2081(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(7) MessageDigest local7 = MessageDigest.getInstance("SHA");
			local7.reset();
			local7.update(arg0);
			@Pc(20) byte[] local20 = local7.digest();
			if (arg1 == "runescape_402490629.pack200") {
				if (local20[0] != -116 || local20[1] != -87 || local20[2] != -85 || local20[3] != 27 || local20[4] != 13 || local20[5] != -45 || local20[6] != -18 || local20[7] != 26 || local20[8] != -109 || local20[9] != -34 || local20[10] != 22 || local20[11] != -11 || local20[12] != 108 || local20[13] != -52 || local20[14] != -55 || local20[15] != 109 || local20[16] != 119 || local20[17] != -58 || local20[18] != -98 || local20[19] != 27) {
					return false;
				}
			} else if (arg1 == "runescape_1822299063.js5") {
				if (local20[0] != 32 || local20[1] != 20 || local20[2] != -87 || local20[3] != 58 || local20[4] != 106 || local20[5] != 86 || local20[6] != -122 || local20[7] != -105 || local20[8] != 74 || local20[9] != 89 || local20[10] != 57 || local20[11] != 97 || local20[12] != -32 || local20[13] != -72 || local20[14] != -48 || local20[15] != 36 || local20[16] != -83 || local20[17] != 58 || local20[18] != -51 || local20[19] != -22) {
					return false;
				}
			} else if (local20[0] != 23 || local20[1] != 83 || local20[2] != 57 || local20[3] != 35 || local20[4] != 83 || local20[5] != -48 || local20[6] != 29 || local20[7] != -121 || local20[8] != 101 || local20[9] != 45 || local20[10] != -13 || local20[11] != -62 || local20[12] != -10 || local20[13] != 46 || local20[14] != -57 || local20[15] != -48 || local20[16] != 115 || local20[17] != 102 || local20[18] != 94 || local20[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(393) Exception local393) {
			this.method2082("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt2964 = Integer.parseInt(this.getParameter("width"));
			this.anInt2963 = Integer.parseInt(this.getParameter("height"));
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
			} catch (@Pc(44) Exception local44) {
			}
			try {
				this.aClass85_1 = new Class85(true, this, local13, "runescape", 16);
			} catch (@Pc(56) Exception local56) {
				this.method2082("nocache");
				return;
			}
			@Pc(67) ClassLoader_Sub1 local67 = new ClassLoader_Sub1();
			@Pc(84) byte[] local84;
			try {
				Class.forName("java.util.jar.Pack200");
				local84 = this.method2084("runescape_402490629.pack200", new File(this.aClass85_1.aFile5, "main_file_cache.dat0"), local26, 242608);
				if (local84 == null) {
					return;
				}
				local67.aClass84_1 = new Class84_Sub1(local84);
			} catch (@Pc(96) Throwable local96) {
			}
			@Pc(126) Class local126;
			if (local67.aClass84_1 == null) {
				local84 = this.method2084("unpackclass_-163111980.jar", new File(this.aClass85_1.aFile5, "game_unpacker.dat"), local28, 19185);
				if (local84 == null) {
					return;
				}
				local67.aClass84_1 = new Class84(local84);
				local126 = Class.forName("Class84");
				local67.aHashtable3.put(local126.getName(), local126);
				@Pc(137) Class local137 = local67.loadClass("unpackclass");
				local67 = new ClassLoader_Sub1();
				local84 = this.method2084("runescape_1822299063.js5", new File(this.aClass85_1.aFile5, "main_file_cache.dat1"), local26, 257006);
				if (local84 == null) {
					return;
				}
				local67.aClass84_1 = (Class84) local137.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local84, Boolean.TRUE);
			}
			local126 = Class.forName("Class87");
			local67.aHashtable3.put(local126.getName(), local126);
			@Pc(199) Class local199 = Class.forName("Class85");
			local67.aHashtable3.put(local199.getName(), local199);
			local126 = Class.forName("Class86");
			local67.aHashtable3.put(local126.getName(), local126);
			local126 = Class.forName("Interface4");
			local67.aHashtable3.put(local126.getName(), local126);
			local126 = local67.loadClass("client");
			this.anApplet3 = (Applet) local126.getDeclaredConstructor().newInstance();
			local126.getMethod("providesignlink", local199).invoke(null, this.aClass85_1);
			this.anApplet3.init();
			this.anApplet3.start();
		} catch (@Pc(262) Exception local262) {
			RuntimeException_Sub2.anInt2959 = 1822299063;
			if (local262 instanceof InvocationTargetException) {
				@Pc(278) Throwable local278 = ((InvocationTargetException) local262).getTargetException();
				if (local278 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2071(this, local278, local262.toString());
			} else {
				RuntimeException_Sub2.method2071(this, local262, null);
			}
			this.method2082("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method2082(@OriginalArg(0) String arg0) {
		if (this.aBoolean122) {
			return;
		}
		this.aBoolean122 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(35) Exception local35) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZILjava/lang/String;BLjava/lang/String;)[B")
	private byte[] method2083(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(15) byte[] local15 = new byte[arg1];
		@Pc(20) Color local20 = new Color(9179409);
		try {
			@Pc(61) InputStream local61;
			if (arg0) {
				@Pc(25) URL local25 = this.getCodeBase();
				@Pc(33) Socket local33 = new Socket(InetAddress.getByName(local25.getHost()), 443);
				local33.setSoTimeout(10000);
				@Pc(39) OutputStream local39 = local33.getOutputStream();
				local39.write(17);
				local39.write(("JAGGRAB " + local25.getFile() + arg3 + "\n\n").getBytes());
				local61 = local33.getInputStream();
			} else {
				local61 = (new URL(this.getCodeBase(), arg3)).openStream();
			}
			@Pc(79) int local79 = -1;
			@Pc(81) int local81 = 0;
			while (local81 < local15.length) {
				@Pc(95) int local95 = local15.length - local81;
				if (local95 > 1000) {
					local95 = 1000;
				}
				@Pc(109) int local109 = local61.read(local15, local81, local95);
				if (local109 < 0) {
					throw new EOFException();
				}
				local81 += local109;
				@Pc(129) int local129 = local81 * 100 / local15.length;
				if (local129 != local79) {
					try {
						@Pc(140) Graphics local140 = this.getGraphics();
						if (local140 == null) {
							this.repaint();
						} else {
							@Pc(156) String local156 = arg2 + " - " + local129 + "%";
							local140.setColor(Color.black);
							local140.fillRect(0, 0, this.anInt2964, this.anInt2963);
							local140.setColor(local20);
							local79 = local129;
							local140.drawRect(this.anInt2964 / 2 - 152, this.anInt2963 / 2 - 18, 303, 33);
							local140.setFont(local8);
							local140.setColor(Color.white);
							local140.drawString(local156, (this.anInt2964 - local12.stringWidth(local156)) / 2, this.anInt2963 / 2 + 4);
						}
					} catch (@Pc(217) Exception local217) {
					}
				}
			}
			local61.close();
		} catch (@Pc(223) IOException local223) {
			return null;
		}
		return this.method2081(local15, arg3) ? local15 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;ZLjava/io/File;Ljava/lang/String;I)[B")
	private byte[] method2084(@OriginalArg(0) String arg0, @OriginalArg(2) File arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(9) byte[] local9 = this.method2080(arg1);
		if (!this.method2081(local9, arg0)) {
			local9 = this.method2083(false, arg3, arg2, arg0);
			if (local9 == null) {
				local9 = this.method2083(true, arg3, arg2, arg0);
			}
			if (local9 == null) {
				this.method2082("download");
				return null;
			}
			if (!this.method2079(arg1, local9)) {
				return null;
			}
			local9 = this.method2080(arg1);
			if (!this.method2081(local9, arg0)) {
				this.method2082("mismatch");
				return null;
			}
		}
		return local9;
	}
}
