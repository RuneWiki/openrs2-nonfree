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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt4029;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Lloader!qd;")
	private Class94 aClass94_1;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt4030;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean173;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean175;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean174;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean176;

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean176 = false;
		this.aBoolean173 = true;
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

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean175 = true;
		this.aBoolean176 = this.aBoolean173 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ZI)[B")
	private byte[] method2943(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(15) byte[] local15 = new byte[arg3];
		@Pc(20) Color local20 = new Color(9179409);
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
			while (local15.length > local80) {
				@Pc(94) int local94 = local15.length - local80;
				if (local94 > 1000) {
					local94 = 1000;
				}
				@Pc(106) int local106 = local66.read(local15, local80, local94);
				if (local106 < 0) {
					throw new EOFException();
				}
				local80 += local106;
				@Pc(126) int local126 = local80 * 100 / local15.length;
				if (local126 != local78) {
					try {
						@Pc(132) Graphics local132 = this.getGraphics();
						if (local132 == null) {
							this.repaint();
						} else {
							local78 = local126;
							@Pc(149) String local149 = arg1 + " - " + local126 + "%";
							local132.setColor(Color.black);
							local132.fillRect(0, 0, this.anInt4030, this.anInt4029);
							local132.setColor(local20);
							local132.drawRect(this.anInt4030 / 2 - 152, this.anInt4029 / 2 - 18, 303, 33);
							local132.setFont(local8);
							local132.setColor(Color.white);
							local132.drawString(local149, (this.anInt4030 - local12.stringWidth(local149)) / 2, this.anInt4029 / 2 + 4);
						}
					} catch (@Pc(208) Exception local208) {
					}
				}
			}
			local66.close();
		} catch (@Pc(214) IOException local214) {
			return null;
		}
		return this.method2945(local15, arg0) ? local15 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;I)Z")
	private boolean method2944(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(22) IOException local22) {
			this.method2948("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/lang/String;I)Z")
	private boolean method2945(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg0);
			@Pc(21) byte[] local21 = local8.digest();
			if (arg1 == "runescape_978409439.pack200") {
				if (local21[0] != 62 || local21[1] != -20 || local21[2] != 21 || local21[3] != 74 || local21[4] != -16 || local21[5] != -124 || local21[6] != 37 || local21[7] != -56 || local21[8] != -2 || local21[9] != 59 || local21[10] != -26 || local21[11] != 49 || local21[12] != 100 || local21[13] != -40 || local21[14] != 29 || local21[15] != -24 || local21[16] != 50 || local21[17] != 105 || local21[18] != -37 || local21[19] != 95) {
					return false;
				}
			} else if (arg1 == "runescape_-1707218632.js5") {
				if (local21[0] != 87 || local21[1] != 91 || local21[2] != 126 || local21[3] != 102 || local21[4] != -99 || local21[5] != -75 || local21[6] != -111 || local21[7] != 37 || local21[8] != 89 || local21[9] != -76 || local21[10] != -97 || local21[11] != -17 || local21[12] != -70 || local21[13] != 61 || local21[14] != -42 || local21[15] != -76 || local21[16] != 125 || local21[17] != 119 || local21[18] != -69 || local21[19] != -76) {
					return false;
				}
			} else if (local21[0] != 23 || local21[1] != 83 || local21[2] != 57 || local21[3] != 35 || local21[4] != 83 || local21[5] != -48 || local21[6] != 29 || local21[7] != -121 || local21[8] != 101 || local21[9] != 45 || local21[10] != -13 || local21[11] != -62 || local21[12] != -10 || local21[13] != 46 || local21[14] != -57 || local21[15] != -48 || local21[16] != 115 || local21[17] != 102 || local21[18] != 94 || local21[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(392) Exception local392) {
			this.method2948("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/io/File;BILjava/lang/String;)[B")
	private byte[] method2946(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(11) byte[] local11 = this.method2947(arg1);
		if (!this.method2945(local11, arg3)) {
			local11 = this.method2943(arg3, arg0, false, arg2);
			if (local11 == null) {
				local11 = this.method2943(arg3, arg0, true, arg2);
			}
			if (local11 == null) {
				this.method2948("download");
				return null;
			}
			if (!this.method2944(local11, arg1)) {
				return null;
			}
			local11 = this.method2947(arg1);
			if (!this.method2945(local11, arg3)) {
				this.method2948("mismatch");
				return null;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method2947(@OriginalArg(0) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean176 = true;
		this.aBoolean173 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt4030 = Integer.parseInt(this.getParameter("width"));
			this.anInt4029 = Integer.parseInt(this.getParameter("height"));
			@Pc(13) int local13 = 32;
			try {
				@Pc(18) int local18 = Integer.parseInt(this.getParameter("modewhat"));
				local13 += local18;
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
			try {
				this.aClass94_1 = new Class94(true, this, local13, "runescape", 16);
			} catch (@Pc(57) Exception local57) {
				this.method2948("nocache");
				return;
			}
			@Pc(68) ClassLoader_Sub1 local68 = new ClassLoader_Sub1();
			@Pc(85) byte[] local85;
			try {
				Class.forName("java.util.jar.Pack200");
				local85 = this.method2946(local28, new File(this.aClass94_1.aFile6, "main_file_cache.dat0"), 274965, "runescape_978409439.pack200");
				if (local85 == null) {
					return;
				}
				local68.aClass91_1 = new Class91_Sub1(local85);
			} catch (@Pc(98) Throwable local98) {
			}
			@Pc(128) Class local128;
			if (local68.aClass91_1 == null) {
				local85 = this.method2946(local26, new File(this.aClass94_1.aFile6, "game_unpacker.dat"), 19185, "unpackclass_-163111980.jar");
				if (local85 == null) {
					return;
				}
				local68.aClass91_1 = new Class91(local85);
				local128 = Class.forName("Class91");
				local68.aHashtable3.put(local128.getName(), local128);
				@Pc(139) Class local139 = local68.loadClass("unpackclass");
				local68 = new ClassLoader_Sub1();
				local85 = this.method2946(local28, new File(this.aClass94_1.aFile6, "main_file_cache.dat1"), 284253, "runescape_-1707218632.js5");
				if (local85 == null) {
					return;
				}
				local68.aClass91_1 = (Class91) local139.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local85, Boolean.TRUE);
			}
			local128 = Class.forName("Class93");
			local68.aHashtable3.put(local128.getName(), local128);
			@Pc(201) Class local201 = Class.forName("Class94");
			local68.aHashtable3.put(local201.getName(), local201);
			local128 = Class.forName("Class92");
			local68.aHashtable3.put(local128.getName(), local128);
			local128 = Class.forName("Interface4");
			local68.aHashtable3.put(local128.getName(), local128);
			local128 = local68.loadClass("client");
			synchronized (this) {
				if (this.aBoolean175) {
					return;
				}
				this.anApplet2 = (Applet) local128.getDeclaredConstructor().newInstance();
				local128.getMethod("providesignlink", local201).invoke(null, this.aClass94_1);
				this.anApplet2.init();
				if (this.aBoolean176) {
					this.anApplet2.start();
				}
				if (this.aBoolean173) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(292) Exception local292) {
			RuntimeException_Sub2.anInt4025 = -1707218632;
			if (local292 instanceof InvocationTargetException) {
				@Pc(308) Throwable local308 = ((InvocationTargetException) local292).getTargetException();
				if (local308 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2928(local292.toString(), this, local308);
			} else {
				RuntimeException_Sub2.method2928(null, this, local292);
			}
			this.method2948("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method2948(@OriginalArg(1) String arg0) {
		if (this.aBoolean174) {
			return;
		}
		this.aBoolean174 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(26) Exception local26) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean175 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}
}
