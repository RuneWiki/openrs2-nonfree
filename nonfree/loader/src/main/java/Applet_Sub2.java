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

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Lloader!vf;")
	private Class87 aClass87_1;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt3413;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt3414;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean125;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean124;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean126;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean127;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;[BI)Z")
	private boolean method2209(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(13) MessageDigest local13 = MessageDigest.getInstance("SHA");
			local13.reset();
			local13.update(arg1);
			@Pc(21) byte[] local21 = local13.digest();
			if (arg0 == "runescape_905221299.pack200") {
				if (local21[0] != -49 || local21[1] != -21 || local21[2] != 33 || local21[3] != -84 || local21[4] != 31 || local21[5] != 38 || local21[6] != -8 || local21[7] != 27 || local21[8] != -42 || local21[9] != -66 || local21[10] != 19 || local21[11] != -102 || local21[12] != -88 || local21[13] != 19 || local21[14] != 77 || local21[15] != -102 || local21[16] != -66 || local21[17] != -19 || local21[18] != 78 || local21[19] != 39) {
					return false;
				}
			} else if (arg0 == "runescape_-1179874893.js5") {
				if (local21[0] != 48 || local21[1] != 49 || local21[2] != -24 || local21[3] != 60 || local21[4] != 28 || local21[5] != -105 || local21[6] != 109 || local21[7] != -7 || local21[8] != -35 || local21[9] != 79 || local21[10] != -121 || local21[11] != 64 || local21[12] != -93 || local21[13] != -38 || local21[14] != -22 || local21[15] != -87 || local21[16] != -57 || local21[17] != -18 || local21[18] != -98 || local21[19] != -31) {
					return false;
				}
			} else if (local21[0] != 23 || local21[1] != 83 || local21[2] != 57 || local21[3] != 35 || local21[4] != 83 || local21[5] != -48 || local21[6] != 29 || local21[7] != -121 || local21[8] != 101 || local21[9] != 45 || local21[10] != -13 || local21[11] != -62 || local21[12] != -10 || local21[13] != 46 || local21[14] != -57 || local21[15] != -48 || local21[16] != 115 || local21[17] != 102 || local21[18] != 94 || local21[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(392) Exception local392) {
			this.method2211("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(1) int local1 = 32;
			this.anInt3414 = Integer.parseInt(this.getParameter("width"));
			this.anInt3413 = Integer.parseInt(this.getParameter("height"));
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
					local28 = "Lade Entpacker";
					local26 = "Lade Spiel-Code";
				}
			} catch (@Pc(44) Exception local44) {
			}
			try {
				this.aClass87_1 = new Class87(true, this, local1, "runescape", 16);
			} catch (@Pc(56) Exception local56) {
				this.method2211("nocache");
				return;
			}
			@Pc(67) ClassLoader_Sub1 local67 = new ClassLoader_Sub1();
			@Pc(84) byte[] local84;
			try {
				Class.forName("java.util.jar.Pack200");
				local84 = this.method2214(new File(this.aClass87_1.aFile6, "main_file_cache.dat0"), 242973, local26, "runescape_905221299.pack200");
				if (local84 == null) {
					return;
				}
				local67.aClass84_1 = new Class84_Sub1(local84);
			} catch (@Pc(95) Throwable local95) {
			}
			@Pc(126) Class local126;
			if (local67.aClass84_1 == null) {
				local84 = this.method2214(new File(this.aClass87_1.aFile6, "game_unpacker.dat"), 19185, local28, "unpackclass_-163111980.jar");
				if (local84 == null) {
					return;
				}
				local67.aClass84_1 = new Class84(local84);
				local126 = Class.forName("Class84");
				local67.aHashtable1.put(local126.getName(), local126);
				@Pc(137) Class local137 = local67.loadClass("unpackclass");
				local67 = new ClassLoader_Sub1();
				local84 = this.method2214(new File(this.aClass87_1.aFile6, "main_file_cache.dat1"), 257179, local26, "runescape_-1179874893.js5");
				if (local84 == null) {
					return;
				}
				local67.aClass84_1 = (Class84) local137.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local84, Boolean.TRUE);
			}
			local126 = Class.forName("Class86");
			local67.aHashtable1.put(local126.getName(), local126);
			@Pc(200) Class local200 = Class.forName("Class87");
			local67.aHashtable1.put(local200.getName(), local200);
			local126 = Class.forName("Class85");
			local67.aHashtable1.put(local126.getName(), local126);
			local126 = Class.forName("Interface4");
			local67.aHashtable1.put(local126.getName(), local126);
			local126 = local67.loadClass("client");
			synchronized (this) {
				if (this.aBoolean124) {
					return;
				}
				this.anApplet2 = (Applet) local126.getDeclaredConstructor().newInstance();
				local126.getMethod("providesignlink", local200).invoke(null, this.aClass87_1);
				this.anApplet2.init();
				if (this.aBoolean126) {
					this.anApplet2.start();
				}
				if (this.aBoolean125) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(292) Exception local292) {
			RuntimeException_Sub2.anInt3412 = -1179874893;
			if (local292 instanceof InvocationTargetException) {
				@Pc(308) Throwable local308 = ((InvocationTargetException) local292).getTargetException();
				if (local308 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2208(this, local308, local292.toString());
			} else {
				RuntimeException_Sub2.method2208(this, local292, null);
			}
			this.method2211("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;IIZLjava/lang/String;)[B")
	private byte[] method2210(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		@Pc(4) byte[] local4 = new byte[arg1];
		@Pc(11) Font local11 = new Font("Helvetica", 1, 13);
		@Pc(15) FontMetrics local15 = this.getFontMetrics(local11);
		@Pc(20) Color local20 = new Color(9179409);
		try {
			@Pc(61) InputStream local61;
			if (arg2) {
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
			@Pc(73) int local73 = -1;
			@Pc(75) int local75 = 0;
			while (local4.length > local75) {
				@Pc(85) int local85 = local4.length - local75;
				if (local85 > 1000) {
					local85 = 1000;
				}
				@Pc(96) int local96 = local61.read(local4, local75, local85);
				if (local96 < 0) {
					throw new EOFException();
				}
				local75 += local96;
				@Pc(116) int local116 = local75 * 100 / local4.length;
				if (local116 != local73) {
					try {
						@Pc(127) Graphics local127 = this.getGraphics();
						if (local127 == null) {
							this.repaint();
						} else {
							@Pc(143) String local143 = arg0 + " - " + local116 + "%";
							local73 = local116;
							local127.setColor(Color.black);
							local127.fillRect(0, 0, this.anInt3414, this.anInt3413);
							local127.setColor(local20);
							local127.drawRect(this.anInt3414 / 2 - 152, this.anInt3413 / 2 + -18, 303, 33);
							local127.setFont(local11);
							local127.setColor(Color.white);
							local127.drawString(local143, (this.anInt3414 - local15.stringWidth(local143)) / 2, this.anInt3413 / 2 + 4);
						}
					} catch (@Pc(204) Exception local204) {
					}
				}
			}
			local61.close();
		} catch (@Pc(210) IOException local210) {
			return null;
		}
		return this.method2209(arg3, local4) ? local4 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method2211(@OriginalArg(1) String arg0) {
		if (this.aBoolean127) {
			return;
		}
		this.aBoolean127 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(27) Exception local27) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean124 = true;
		this.aBoolean126 = this.aBoolean125 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean125 = false;
		this.aBoolean126 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean124 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;I)Z")
	private boolean method2212(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method2211("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method2213(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(20) byte[] local20 = new byte[local9];
			@Pc(31) DataInputStream local31 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			local31.readFully(local20, 0, local9);
			local31.close();
			return local20;
		} catch (@Pc(41) IOException local41) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean125 = true;
		this.aBoolean126 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;BILjava/lang/String;Ljava/lang/String;)[B")
	private byte[] method2214(@OriginalArg(0) File arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		@Pc(4) byte[] local4 = this.method2213(arg0);
		if (!this.method2209(arg3, local4)) {
			local4 = this.method2210(arg2, arg1, false, arg3);
			if (local4 == null) {
				local4 = this.method2210(arg2, arg1, true, arg3);
			}
			if (local4 == null) {
				this.method2211("download");
				return null;
			}
			if (!this.method2212(local4, arg0)) {
				return null;
			}
			local4 = this.method2213(arg0);
			if (!this.method2209(arg3, local4)) {
				this.method2211("mismatch");
				return null;
			}
		}
		return local4;
	}
}
