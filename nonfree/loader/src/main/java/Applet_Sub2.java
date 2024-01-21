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
	private int anInt3282;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Lloader!vb;")
	private Class86 aClass86_1;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt3283;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean186;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;[BI)Z")
	private boolean method2288(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(7) MessageDigest local7 = MessageDigest.getInstance("SHA");
			local7.reset();
			local7.update(arg1);
			@Pc(26) byte[] local26 = local7.digest();
			if (arg0 == "runescape_-43230525.pack200") {
				if (local26[0] != 90 || local26[1] != 87 || local26[2] != -1 || local26[3] != 100 || local26[4] != 29 || local26[5] != 110 || local26[6] != 66 || local26[7] != -2 || local26[8] != 56 || local26[9] != -111 || local26[10] != 124 || local26[11] != 75 || local26[12] != -57 || local26[13] != -72 || local26[14] != 35 || local26[15] != -78 || local26[16] != -125 || local26[17] != 116 || local26[18] != -109 || local26[19] != -15) {
					return false;
				}
			} else if (arg0 == "runescape_221954570.js5") {
				if (local26[0] != -72 || local26[1] != -53 || local26[2] != 11 || local26[3] != 45 || local26[4] != -71 || local26[5] != 115 || local26[6] != 17 || local26[7] != 56 || local26[8] != -119 || local26[9] != -12 || local26[10] != -121 || local26[11] != 1 || local26[12] != -45 || local26[13] != -25 || local26[14] != -28 || local26[15] != 3 || local26[16] != 79 || local26[17] != 73 || local26[18] != -59 || local26[19] != -116) {
					return false;
				}
			} else if (local26[0] != 23 || local26[1] != 83 || local26[2] != 57 || local26[3] != 35 || local26[4] != 83 || local26[5] != -48 || local26[6] != 29 || local26[7] != -121 || local26[8] != 101 || local26[9] != 45 || local26[10] != -13 || local26[11] != -62 || local26[12] != -10 || local26[13] != 46 || local26[14] != -57 || local26[15] != -48 || local26[16] != 115 || local26[17] != 102 || local26[18] != 94 || local26[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(401) Exception local401) {
			this.method2289("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method2289(@OriginalArg(0) String arg0) {
		if (this.aBoolean186) {
			return;
		}
		this.aBoolean186 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/io/File;)Z")
	private boolean method2290(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(10) FileOutputStream local10 = new FileOutputStream(arg1);
			local10.write(arg0, 0, arg0.length);
			local10.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method2289("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;BLjava/io/File;)[B")
	private byte[] method2291(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(4) File arg3) {
		@Pc(10) byte[] local10 = this.method2293(arg3);
		if (!this.method2288(arg1, local10)) {
			local10 = this.method2292(arg1, arg0, false, arg2);
			if (local10 == null) {
				local10 = this.method2292(arg1, arg0, true, arg2);
			}
			if (local10 == null) {
				this.method2289("download");
				return null;
			}
			if (!this.method2290(local10, arg3)) {
				return null;
			}
			local10 = this.method2293(arg3);
			if (!this.method2288(arg1, local10)) {
				this.method2289("mismatch");
				return null;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt3282 = Integer.parseInt(this.getParameter("width"));
			@Pc(7) int local7 = 32;
			this.anInt3283 = Integer.parseInt(this.getParameter("height"));
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
			} catch (@Pc(44) Exception local44) {
			}
			try {
				this.aClass86_1 = new Class86(true, this, local7, "runescape", 16);
			} catch (@Pc(56) Exception local56) {
				this.method2289("nocache");
				return;
			}
			@Pc(65) ClassLoader_Sub1 local65 = new ClassLoader_Sub1();
			@Pc(84) byte[] local84;
			try {
				Class.forName("java.util.jar.Pack200");
				local84 = this.method2291(236833, "runescape_-43230525.pack200", local26, new File(this.aClass86_1.aFile6, "main_file_cache.dat0"));
				if (local84 == null) {
					return;
				}
				local65.aClass83_1 = new Class83_Sub1(local84);
			} catch (@Pc(96) Throwable local96) {
			}
			@Pc(127) Class local127;
			if (local65.aClass83_1 == null) {
				local84 = this.method2291(19185, "unpackclass_-163111980.jar", local28, new File(this.aClass86_1.aFile6, "game_unpacker.dat"));
				if (local84 == null) {
					return;
				}
				local65.aClass83_1 = new Class83(local84);
				local127 = Class.forName("Class83");
				local65.aHashtable3.put(local127.getName(), local127);
				@Pc(138) Class local138 = local65.loadClass("unpackclass");
				local65 = new ClassLoader_Sub1();
				local84 = this.method2291(253467, "runescape_221954570.js5", local26, new File(this.aClass86_1.aFile6, "main_file_cache.dat1"));
				if (local84 == null) {
					return;
				}
				local65.aClass83_1 = (Class83) local138.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local84, Boolean.TRUE);
			}
			local127 = Class.forName("Class85");
			local65.aHashtable3.put(local127.getName(), local127);
			@Pc(201) Class local201 = Class.forName("Class86");
			local65.aHashtable3.put(local201.getName(), local201);
			local127 = Class.forName("Class84");
			local65.aHashtable3.put(local127.getName(), local127);
			local127 = Class.forName("Interface4");
			local65.aHashtable3.put(local127.getName(), local127);
			local127 = local65.loadClass("client");
			this.anApplet2 = (Applet) local127.getDeclaredConstructor().newInstance();
			local127.getMethod("providesignlink", local201).invoke(null, this.aClass86_1);
			this.anApplet2.init();
			this.anApplet2.start();
		} catch (@Pc(264) Exception local264) {
			RuntimeException_Sub2.anInt3278 = 221954570;
			if (local264 instanceof InvocationTargetException) {
				@Pc(273) Throwable local273 = ((InvocationTargetException) local264).getTargetException();
				if (local273 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2275(this, local273, local264.toString());
			} else {
				RuntimeException_Sub2.method2275(this, local264, null);
			}
			this.method2289("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;IZBLjava/lang/String;)[B")
	private byte[] method2292(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(22) Color local22 = new Color(9179409);
		@Pc(25) byte[] local25 = new byte[arg1];
		try {
			@Pc(66) InputStream local66;
			if (arg2) {
				@Pc(30) URL local30 = this.getCodeBase();
				@Pc(38) Socket local38 = new Socket(InetAddress.getByName(local30.getHost()), 443);
				local38.setSoTimeout(10000);
				@Pc(44) OutputStream local44 = local38.getOutputStream();
				local44.write(17);
				local44.write(("JAGGRAB " + local30.getFile() + arg0 + "\n\n").getBytes());
				local66 = local38.getInputStream();
			} else {
				local66 = (new URL(this.getCodeBase(), arg0)).openStream();
			}
			@Pc(78) int local78 = -1;
			@Pc(80) int local80 = 0;
			while (local80 < local25.length) {
				@Pc(90) int local90 = local25.length - local80;
				if (local90 > 1000) {
					local90 = 1000;
				}
				@Pc(104) int local104 = local66.read(local25, local80, local90);
				if (local104 < 0) {
					throw new EOFException();
				}
				local80 += local104;
				@Pc(124) int local124 = local80 * 100 / local25.length;
				if (local78 != local124) {
					try {
						@Pc(131) Graphics local131 = this.getGraphics();
						if (local131 == null) {
							this.repaint();
						} else {
							local78 = local124;
							@Pc(148) String local148 = arg3 + " - " + local124 + "%";
							local131.setColor(Color.black);
							local131.fillRect(0, 0, this.anInt3282, this.anInt3283);
							local131.setColor(local22);
							local131.drawRect(this.anInt3282 / 2 - 152, this.anInt3283 / 2 + -18, 303, 33);
							local131.setFont(local8);
							local131.setColor(Color.white);
							local131.drawString(local148, (this.anInt3282 - local12.stringWidth(local148)) / 2, this.anInt3283 / 2 + 4);
						}
					} catch (@Pc(208) Exception local208) {
					}
				}
			}
			local66.close();
		} catch (@Pc(214) IOException local214) {
			return null;
		}
		return this.method2288(arg0, local25) ? local25 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;Z)[B")
	private byte[] method2293(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(13) int local13 = (int) arg0.length();
			@Pc(24) DataInputStream local24 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(27) byte[] local27 = new byte[local13];
			local24.readFully(local27, 0, local13);
			local24.close();
			return local27;
		} catch (@Pc(37) IOException local37) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
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
}
