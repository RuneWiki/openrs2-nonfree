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
	private int anInt3206;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt3207;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Lloader!ue;")
	private Class84 aClass84_1;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean246;

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;)[B")
	private byte[] method2048(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(19) int local19 = (int) arg0.length();
			@Pc(22) byte[] local22 = new byte[local19];
			@Pc(33) DataInputStream local33 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			local33.readFully(local22, 0, local19);
			local33.close();
			return local22;
		} catch (@Pc(43) IOException local43) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private void method2049(@OriginalArg(0) String arg0) {
		if (this.aBoolean246) {
			return;
		}
		this.aBoolean246 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(27) Exception local27) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BILjava/lang/String;)Z")
	private boolean method2050(@OriginalArg(0) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(12) MessageDigest local12 = MessageDigest.getInstance("SHA");
			local12.reset();
			local12.update(arg0);
			@Pc(20) byte[] local20 = local12.digest();
			if (arg1 == "runescape.pack200?crc=-349428449") {
				if (local20[0] != -33 || local20[1] != 46 || local20[2] != 106 || local20[3] != 101 || local20[4] != 91 || local20[5] != 27 || local20[6] != -73 || local20[7] != -123 || local20[8] != -97 || local20[9] != 85 || local20[10] != -66 || local20[11] != -28 || local20[12] != 93 || local20[13] != -36 || local20[14] != 85 || local20[15] != 116 || local20[16] != -9 || local20[17] != -64 || local20[18] != -30 || local20[19] != 118) {
					return false;
				}
			} else if (arg1 == "runescape.js5?crc=-776153945") {
				if (local20[0] != 63 || local20[1] != -101 || local20[2] != 112 || local20[3] != -27 || local20[4] != 59 || local20[5] != -34 || local20[6] != -85 || local20[7] != -103 || local20[8] != 24 || local20[9] != -117 || local20[10] != -84 || local20[11] != 62 || local20[12] != 97 || local20[13] != -90 || local20[14] != 17 || local20[15] != 66 || local20[16] != 16 || local20[17] != -107 || local20[18] != 108 || local20[19] != -100) {
					return false;
				}
			} else if (local20[0] != 3 || local20[1] != -21 || local20[2] != 65 || local20[3] != -60 || local20[4] != -33 || local20[5] != -24 || local20[6] != 92 || local20[7] != 4 || local20[8] != -2 || local20[9] != 48 || local20[10] != 106 || local20[11] != 50 || local20[12] != -46 || local20[13] != -31 || local20[14] != -44 || local20[15] != 120 || local20[16] != -104 || local20[17] != 72 || local20[18] != 50 || local20[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(389) Exception local389) {
			this.method2049("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;[B)Z")
	private boolean method2051(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(10) FileOutputStream local10 = new FileOutputStream(arg0);
			local10.write(arg1, 0, arg1.length);
			local10.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method2049("savefile");
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;ILjava/lang/String;Ljava/lang/String;B)[B")
	private byte[] method2052(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		@Pc(4) byte[] local4 = this.method2048(arg0);
		if (!this.method2050(local4, arg3)) {
			local4 = this.method2053(arg2, arg3, false, arg1);
			if (local4 == null) {
				local4 = this.method2053(arg2, arg3, true, arg1);
			}
			if (local4 == null) {
				this.method2049("download");
				return null;
			}
			if (!this.method2051(arg0, local4)) {
				return null;
			}
			local4 = this.method2048(arg0);
			if (!this.method2050(local4, arg3)) {
				this.method2049("mismatch");
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
			this.anInt3207 = Integer.parseInt(this.getParameter("width"));
			this.anInt3206 = Integer.parseInt(this.getParameter("height"));
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
			} catch (@Pc(45) Exception local45) {
			}
			try {
				this.aClass84_1 = new Class84(true, this, local1, "runescape", 16);
			} catch (@Pc(57) Exception local57) {
				this.method2049("nocache");
				return;
			}
			@Pc(68) ClassLoader_Sub1 local68 = new ClassLoader_Sub1();
			@Pc(85) byte[] local85;
			try {
				Class.forName("java.util.jar.Pack200");
				local85 = this.method2052(new File(this.aClass84_1.aFile4, "main_file_cache.dat0"), 238793, local26, "runescape.pack200?crc=-349428449");
				if (local85 == null) {
					return;
				}
				local68.aClass82_1 = new Class82_Sub1(local85);
			} catch (@Pc(96) Throwable local96) {
			}
			@Pc(126) Class local126;
			if (local68.aClass82_1 == null) {
				local85 = this.method2052(new File(this.aClass84_1.aFile4, "game_unpacker.dat"), 17836, local28, "unpackclass.jar?crc=-549807395");
				if (local85 == null) {
					return;
				}
				local68.aClass82_1 = new Class82(local85);
				local126 = Class.forName("Class82");
				local68.aHashtable1.put(local126.getName(), local126);
				@Pc(137) Class local137 = local68.loadClass("unpackclass");
				local68 = new ClassLoader_Sub1();
				local85 = this.method2052(new File(this.aClass84_1.aFile4, "main_file_cache.dat1"), 252802, local26, "runescape.js5?crc=-776153945");
				if (local85 == null) {
					return;
				}
				local68.aClass82_1 = (Class82) local137.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local85, Boolean.TRUE);
			}
			local126 = Class.forName("Class85");
			local68.aHashtable1.put(local126.getName(), local126);
			@Pc(199) Class local199 = Class.forName("Class84");
			local68.aHashtable1.put(local199.getName(), local199);
			local126 = Class.forName("Class83");
			local68.aHashtable1.put(local126.getName(), local126);
			local126 = Class.forName("Interface4");
			local68.aHashtable1.put(local126.getName(), local126);
			local126 = local68.loadClass("client");
			this.anApplet2 = (Applet) local126.getDeclaredConstructor().newInstance();
			local126.getMethod("providesignlink", local199).invoke(null, this.aClass84_1);
			this.anApplet2.init();
			this.anApplet2.start();
		} catch (@Pc(262) Exception local262) {
			RuntimeException_Sub2.anInt3205 = -776153945;
			if (local262 instanceof InvocationTargetException) {
				@Pc(271) Throwable local271 = ((InvocationTargetException) local262).getTargetException();
				if (local271 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2046(local271, this, local262.toString());
			} else {
				RuntimeException_Sub2.method2046(local262, this, null);
			}
			this.method2049("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZI)[B")
	private byte[] method2053(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(22) FontMetrics local22 = this.getFontMetrics(local8);
		@Pc(27) Color local27 = new Color(9179409);
		@Pc(30) byte[] local30 = new byte[arg3];
		try {
			@Pc(71) InputStream local71;
			if (arg2) {
				@Pc(35) URL local35 = this.getCodeBase();
				@Pc(43) Socket local43 = new Socket(InetAddress.getByName(local35.getHost()), 443);
				local43.setSoTimeout(10000);
				@Pc(49) OutputStream local49 = local43.getOutputStream();
				local49.write(17);
				local49.write(("JAGGRAB " + local35.getFile() + arg1 + "\n\n").getBytes());
				local71 = local43.getInputStream();
			} else {
				local71 = (new URL(this.getCodeBase(), arg1)).openStream();
			}
			@Pc(83) int local83 = -1;
			@Pc(85) int local85 = 0;
			while (local30.length > local85) {
				@Pc(95) int local95 = local30.length - local85;
				if (local95 > 1000) {
					local95 = 1000;
				}
				@Pc(107) int local107 = local71.read(local30, local85, local95);
				if (local107 < 0) {
					throw new EOFException();
				}
				local85 += local107;
				@Pc(127) int local127 = local85 * 100 / local30.length;
				if (local83 != local127) {
					try {
						@Pc(137) Graphics local137 = this.getGraphics();
						if (local137 == null) {
							this.repaint();
						} else {
							local137.setColor(Color.black);
							local83 = local127;
							local137.fillRect(0, 0, this.anInt3207, this.anInt3206);
							local137.setColor(local27);
							@Pc(172) String local172 = arg0 + " - " + local127 + "%";
							local137.drawRect(this.anInt3207 / 2 - 152, this.anInt3206 / 2 + -18, 303, 33);
							local137.setFont(local8);
							local137.setColor(Color.white);
							local137.drawString(local172, (this.anInt3207 - local22.stringWidth(local172)) / 2, this.anInt3206 / 2 + 4);
						}
					} catch (@Pc(214) Exception local214) {
					}
				}
			}
			local71.close();
		} catch (@Pc(220) IOException local220) {
			return null;
		}
		return this.method2050(local30, arg1) ? local30 : null;
	}
}
