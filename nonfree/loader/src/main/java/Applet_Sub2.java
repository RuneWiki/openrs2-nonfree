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

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt3828;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt3829;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Lloader!pc;")
	private Class92 aClass92_1;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean171;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean170;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean172;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean173;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	private boolean method2724(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			this.method2725("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt3828 = Integer.parseInt(this.getParameter("width"));
			this.anInt3829 = Integer.parseInt(this.getParameter("height"));
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
			} catch (@Pc(45) Exception local45) {
			}
			try {
				this.aClass92_1 = new Class92(true, this, local13, "runescape", 16);
			} catch (@Pc(57) Exception local57) {
				this.method2725("nocache");
				return;
			}
			@Pc(68) ClassLoader_Sub1 local68 = new ClassLoader_Sub1();
			@Pc(85) byte[] local85;
			try {
				Class.forName("java.util.jar.Pack200");
				local85 = this.method2726(272610, "runescape_-1901212798.pack200", local26, new File(this.aClass92_1.aFile4, "main_file_cache.dat0"));
				if (local85 == null) {
					return;
				}
				local68.aClass90_1 = new Class90_Sub1(local85);
			} catch (@Pc(97) Throwable local97) {
			}
			@Pc(128) Class local128;
			if (local68.aClass90_1 == null) {
				local85 = this.method2726(19185, "unpackclass_-163111980.jar", local28, new File(this.aClass92_1.aFile4, "game_unpacker.dat"));
				if (local85 == null) {
					return;
				}
				local68.aClass90_1 = new Class90(local85);
				local128 = Class.forName("Class90");
				local68.aHashtable1.put(local128.getName(), local128);
				@Pc(139) Class local139 = local68.loadClass("unpackclass");
				local68 = new ClassLoader_Sub1();
				local85 = this.method2726(281846, "runescape_-1305902955.js5", local26, new File(this.aClass92_1.aFile4, "main_file_cache.dat1"));
				if (local85 == null) {
					return;
				}
				local68.aClass90_1 = (Class90) local139.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local85, Boolean.TRUE);
			}
			local128 = Class.forName("Class93");
			local68.aHashtable1.put(local128.getName(), local128);
			@Pc(201) Class local201 = Class.forName("Class92");
			local68.aHashtable1.put(local201.getName(), local201);
			local128 = Class.forName("Class91");
			local68.aHashtable1.put(local128.getName(), local128);
			local128 = Class.forName("Interface4");
			local68.aHashtable1.put(local128.getName(), local128);
			local128 = local68.loadClass("client");
			synchronized (this) {
				if (this.aBoolean172) {
					return;
				}
				this.anApplet2 = (Applet) local128.getDeclaredConstructor().newInstance();
				local128.getMethod("providesignlink", local201).invoke(null, this.aClass92_1);
				this.anApplet2.init();
				if (this.aBoolean171) {
					this.anApplet2.start();
				}
				if (this.aBoolean173) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(292) Exception local292) {
			RuntimeException_Sub2.anInt3823 = -1305902955;
			if (local292 instanceof InvocationTargetException) {
				@Pc(301) Throwable local301 = ((InvocationTargetException) local292).getTargetException();
				if (local301 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2720(this, local292.toString(), local301);
			} else {
				RuntimeException_Sub2.method2720(this, null, local292);
			}
			this.method2725("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method2725(@OriginalArg(1) String arg0) {
		if (this.aBoolean170) {
			return;
		}
		this.aBoolean170 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(33) Exception local33) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;Ljava/io/File;)[B")
	private byte[] method2726(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) File arg3) {
		@Pc(4) byte[] local4 = this.method2728(arg3);
		if (!this.method2729(local4, arg1)) {
			local4 = this.method2727(arg2, arg1, arg0, false);
			if (local4 == null) {
				local4 = this.method2727(arg2, arg1, arg0, true);
			}
			if (local4 == null) {
				this.method2725("download");
				return null;
			}
			if (!this.method2724(arg3, local4)) {
				return null;
			}
			local4 = this.method2728(arg3);
			if (!this.method2729(local4, arg1)) {
				this.method2725("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean172 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean171 = true;
		this.aBoolean173 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;IZ)[B")
	private byte[] method2727(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(20) byte[] local20 = new byte[arg2];
		try {
			@Pc(30) InputStream local30;
			if (arg3) {
				@Pc(35) URL local35 = this.getCodeBase();
				@Pc(43) Socket local43 = new Socket(InetAddress.getByName(local35.getHost()), 443);
				local43.setSoTimeout(10000);
				@Pc(49) OutputStream local49 = local43.getOutputStream();
				local49.write(17);
				local49.write(("JAGGRAB " + local35.getFile() + arg1 + "\n\n").getBytes());
				local30 = local43.getInputStream();
			} else {
				local30 = (new URL(this.getCodeBase(), arg1)).openStream();
			}
			@Pc(79) int local79 = -1;
			@Pc(81) int local81 = 0;
			while (local20.length > local81) {
				@Pc(91) int local91 = local20.length - local81;
				if (local91 > 1000) {
					local91 = 1000;
				}
				@Pc(102) int local102 = local30.read(local20, local81, local91);
				if (local102 < 0) {
					throw new EOFException();
				}
				local81 += local102;
				@Pc(121) int local121 = local81 * 100 / local20.length;
				if (local121 != local79) {
					try {
						@Pc(127) Graphics local127 = this.getGraphics();
						if (local127 == null) {
							this.repaint();
						} else {
							local79 = local121;
							@Pc(144) String local144 = arg0 + " - " + local121 + "%";
							local127.setColor(Color.black);
							local127.fillRect(0, 0, this.anInt3828, this.anInt3829);
							local127.setColor(local17);
							local127.drawRect(this.anInt3828 / 2 - 152, this.anInt3829 / 2 + -18, 303, 33);
							local127.setFont(local8);
							local127.setColor(Color.white);
							local127.drawString(local144, (this.anInt3828 - local12.stringWidth(local144)) / 2, this.anInt3829 / 2 + 4);
						}
					} catch (@Pc(203) Exception local203) {
					}
				}
			}
			local30.close();
		} catch (@Pc(209) IOException local209) {
			return null;
		}
		return this.method2729(local20, arg1) ? local20 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method2728(@OriginalArg(1) File arg0) {
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
		} catch (@Pc(39) IOException local39) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean171 = false;
		this.aBoolean173 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean172 = true;
		this.aBoolean171 = this.aBoolean173 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BBLjava/lang/String;)Z")
	private boolean method2729(@OriginalArg(0) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(11) MessageDigest local11 = MessageDigest.getInstance("SHA");
			local11.reset();
			local11.update(arg0);
			@Pc(19) byte[] local19 = local11.digest();
			if (arg1 == "runescape_-1901212798.pack200") {
				if (local19[0] != -59 || local19[1] != -121 || local19[2] != 73 || local19[3] != -6 || local19[4] != 51 || local19[5] != 83 || local19[6] != 100 || local19[7] != 90 || local19[8] != -121 || local19[9] != 38 || local19[10] != 104 || local19[11] != 124 || local19[12] != 23 || local19[13] != -95 || local19[14] != -59 || local19[15] != -80 || local19[16] != 0 || local19[17] != 119 || local19[18] != -4 || local19[19] != -69) {
					return false;
				}
			} else if (arg1 == "runescape_-1305902955.js5") {
				if (local19[0] != -13 || local19[1] != -19 || local19[2] != 81 || local19[3] != -102 || local19[4] != 1 || local19[5] != 107 || local19[6] != 15 || local19[7] != -101 || local19[8] != 63 || local19[9] != -10 || local19[10] != -8 || local19[11] != 100 || local19[12] != 117 || local19[13] != -28 || local19[14] != 124 || local19[15] != -1 || local19[16] != -108 || local19[17] != 86 || local19[18] != 88 || local19[19] != -118) {
					return false;
				}
			} else if (local19[0] != 23 || local19[1] != 83 || local19[2] != 57 || local19[3] != 35 || local19[4] != 83 || local19[5] != -48 || local19[6] != 29 || local19[7] != -121 || local19[8] != 101 || local19[9] != 45 || local19[10] != -13 || local19[11] != -62 || local19[12] != -10 || local19[13] != 46 || local19[14] != -57 || local19[15] != -48 || local19[16] != 115 || local19[17] != 102 || local19[18] != 94 || local19[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(386) Exception local386) {
			this.method2725("sha");
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
}
