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

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt3037;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Lloader!jb;")
	private Class85 aClass85_1;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt3038;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean130;

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method2167(@OriginalArg(0) File arg0) {
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
		} catch (@Pc(33) IOException local33) {
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

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method2168(@OriginalArg(1) String arg0) {
		if (this.aBoolean130) {
			return;
		}
		this.aBoolean130 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;Z)Z")
	private boolean method2169(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(8) FileOutputStream local8 = new FileOutputStream(arg1);
			local8.write(arg0, 0, arg0.length);
			local8.close();
			return true;
		} catch (@Pc(19) IOException local19) {
			this.method2168("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt3038 = Integer.parseInt(this.getParameter("width"));
			this.anInt3037 = Integer.parseInt(this.getParameter("height"));
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
			} catch (@Pc(44) Exception local44) {
			}
			try {
				this.aClass85_1 = new Class85(true, this, local13, "runescape", 16);
			} catch (@Pc(56) Exception local56) {
				this.method2168("nocache");
				return;
			}
			@Pc(67) ClassLoader_Sub1 local67 = new ClassLoader_Sub1();
			@Pc(84) byte[] local84;
			try {
				Class.forName("java.util.jar.Pack200");
				local84 = this.method2170(local26, new File(this.aClass85_1.aFile5, "main_file_cache.dat0"), 233670, "runescape_196323747.pack200");
				if (local84 == null) {
					return;
				}
				local67.aClass82_1 = new Class82_Sub1(local84);
			} catch (@Pc(95) Throwable local95) {
			}
			@Pc(126) Class local126;
			if (local67.aClass82_1 == null) {
				local84 = this.method2170(local28, new File(this.aClass85_1.aFile5, "game_unpacker.dat"), 19185, "unpackclass_-163111980.jar");
				if (local84 == null) {
					return;
				}
				local67.aClass82_1 = new Class82(local84);
				local126 = Class.forName("Class82");
				local67.aHashtable1.put(local126.getName(), local126);
				@Pc(137) Class local137 = local67.loadClass("unpackclass");
				local67 = new ClassLoader_Sub1();
				local84 = this.method2170(local26, new File(this.aClass85_1.aFile5, "main_file_cache.dat1"), 249537, "runescape_-798893239.js5");
				if (local84 == null) {
					return;
				}
				local67.aClass82_1 = (Class82) local137.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local84, Boolean.TRUE);
			}
			local126 = Class.forName("Class84");
			local67.aHashtable1.put(local126.getName(), local126);
			@Pc(198) Class local198 = Class.forName("Class85");
			local67.aHashtable1.put(local198.getName(), local198);
			local126 = Class.forName("Class83");
			local67.aHashtable1.put(local126.getName(), local126);
			local126 = Class.forName("Interface4");
			local67.aHashtable1.put(local126.getName(), local126);
			local126 = local67.loadClass("client");
			this.anApplet3 = (Applet) local126.getDeclaredConstructor().newInstance();
			local126.getMethod("providesignlink", local198).invoke(null, this.aClass85_1);
			this.anApplet3.init();
			this.anApplet3.start();
		} catch (@Pc(261) Exception local261) {
			RuntimeException_Sub2.anInt3031 = -798893239;
			if (local261 instanceof InvocationTargetException) {
				@Pc(277) Throwable local277 = ((InvocationTargetException) local261).getTargetException();
				if (local277 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2145(local261.toString(), local277, this);
			} else {
				RuntimeException_Sub2.method2145(null, local261, this);
			}
			this.method2168("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/io/File;IILjava/lang/String;)[B")
	private byte[] method2170(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(12) byte[] local12 = this.method2167(arg1);
		if (!this.method2172(local12, arg3)) {
			local12 = this.method2171(arg3, arg0, false, arg2);
			if (local12 == null) {
				local12 = this.method2171(arg3, arg0, true, arg2);
			}
			if (local12 == null) {
				this.method2168("download");
				return null;
			}
			if (!this.method2169(local12, arg1)) {
				return null;
			}
			local12 = this.method2167(arg1);
			if (!this.method2172(local12, arg3)) {
				this.method2168("mismatch");
				return null;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;ZI)[B")
	private byte[] method2171(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(15) byte[] local15 = new byte[arg3];
		@Pc(20) Color local20 = new Color(9179409);
		try {
			@Pc(61) InputStream local61;
			if (arg2) {
				@Pc(25) URL local25 = this.getCodeBase();
				@Pc(33) Socket local33 = new Socket(InetAddress.getByName(local25.getHost()), 443);
				local33.setSoTimeout(10000);
				@Pc(39) OutputStream local39 = local33.getOutputStream();
				local39.write(17);
				local39.write(("JAGGRAB " + local25.getFile() + arg0 + "\n\n").getBytes());
				local61 = local33.getInputStream();
			} else {
				local61 = (new URL(this.getCodeBase(), arg0)).openStream();
			}
			@Pc(73) int local73 = -1;
			@Pc(81) int local81 = 0;
			while (local81 < local15.length) {
				@Pc(94) int local94 = local15.length - local81;
				if (local94 > 1000) {
					local94 = 1000;
				}
				@Pc(106) int local106 = local61.read(local15, local81, local94);
				if (local106 < 0) {
					throw new EOFException();
				}
				local81 += local106;
				@Pc(127) int local127 = local81 * 100 / local15.length;
				if (local127 != local73) {
					try {
						@Pc(138) Graphics local138 = this.getGraphics();
						if (local138 == null) {
							this.repaint();
						} else {
							local138.setColor(Color.black);
							local73 = local127;
							local138.fillRect(0, 0, this.anInt3038, this.anInt3037);
							local138.setColor(local20);
							local138.drawRect(this.anInt3038 / 2 - 152, this.anInt3037 / 2 + -18, 303, 33);
							@Pc(189) String local189 = arg1 + " - " + local127 + "%";
							local138.setFont(local8);
							local138.setColor(Color.white);
							local138.drawString(local189, (this.anInt3038 - local12.stringWidth(local189)) / 2, this.anInt3037 / 2 + 4);
						}
					} catch (@Pc(214) Exception local214) {
					}
				}
			}
			local61.close();
		} catch (@Pc(220) IOException local220) {
			return null;
		}
		return this.method2172(local15, arg0) ? local15 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/lang/String;)Z")
	private boolean method2172(@OriginalArg(1) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(7) MessageDigest local7 = MessageDigest.getInstance("SHA");
			local7.reset();
			local7.update(arg0);
			@Pc(15) byte[] local15 = local7.digest();
			if (arg1 == "runescape_196323747.pack200") {
				if (local15[0] != 103 || local15[1] != -26 || local15[2] != 124 || local15[3] != -113 || local15[4] != 64 || local15[5] != 121 || local15[6] != -111 || local15[7] != 60 || local15[8] != 56 || local15[9] != -1 || local15[10] != 80 || local15[11] != -87 || local15[12] != 69 || local15[13] != -46 || local15[14] != 13 || local15[15] != 50 || local15[16] != 68 || local15[17] != 40 || local15[18] != 56 || local15[19] != -8) {
					return false;
				}
			} else if (arg1 == "runescape_-798893239.js5") {
				if (local15[0] != 8 || local15[1] != -82 || local15[2] != -4 || local15[3] != -30 || local15[4] != 67 || local15[5] != -17 || local15[6] != 54 || local15[7] != 32 || local15[8] != -78 || local15[9] != -112 || local15[10] != -75 || local15[11] != -81 || local15[12] != -121 || local15[13] != -114 || local15[14] != -17 || local15[15] != 121 || local15[16] != -112 || local15[17] != 69 || local15[18] != 5 || local15[19] != -19) {
					return false;
				}
			} else if (local15[0] != 23 || local15[1] != 83 || local15[2] != 57 || local15[3] != 35 || local15[4] != 83 || local15[5] != -48 || local15[6] != 29 || local15[7] != -121 || local15[8] != 101 || local15[9] != 45 || local15[10] != -13 || local15[11] != -62 || local15[12] != -10 || local15[13] != 46 || local15[14] != -57 || local15[15] != -48 || local15[16] != 115 || local15[17] != 102 || local15[18] != 94 || local15[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(392) Exception local392) {
			this.method2168("sha");
			return false;
		}
	}
}
