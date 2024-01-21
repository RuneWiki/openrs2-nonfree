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
	private int anInt4083;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Lloader!qe;")
	private Class92 aClass92_1;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt4084;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean175;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean176;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean178;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean177;

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean175 = true;
		this.aBoolean177 = false;
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method2915(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(26) DataInputStream local26 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(29) byte[] local29 = new byte[local9];
			local26.readFully(local29, 0, local9);
			local26.close();
			return local29;
		} catch (@Pc(39) IOException local39) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	private boolean method2916(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(13) FileOutputStream local13 = new FileOutputStream(arg0);
			local13.write(arg1, 0, arg1.length);
			local13.close();
			return true;
		} catch (@Pc(24) IOException local24) {
			this.method2920("savefile");
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/lang/String;I)Z")
	private boolean method2917(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(7) MessageDigest local7 = MessageDigest.getInstance("SHA");
			local7.reset();
			local7.update(arg0);
			@Pc(22) byte[] local22 = local7.digest();
			if (arg1 == "runescape_1525208724.pack200") {
				if (local22[0] != -12 || local22[1] != 35 || local22[2] != 18 || local22[3] != 18 || local22[4] != -112 || local22[5] != 98 || local22[6] != 7 || local22[7] != 99 || local22[8] != -116 || local22[9] != -100 || local22[10] != 103 || local22[11] != 22 || local22[12] != -43 || local22[13] != -25 || local22[14] != 10 || local22[15] != 89 || local22[16] != 41 || local22[17] != 86 || local22[18] != 56 || local22[19] != 52) {
					return false;
				}
			} else if (arg1 == "runescape_2114627885.js5") {
				if (local22[0] != -99 || local22[1] != 57 || local22[2] != 113 || local22[3] != -11 || local22[4] != -68 || local22[5] != -11 || local22[6] != 64 || local22[7] != 19 || local22[8] != 32 || local22[9] != -87 || local22[10] != 50 || local22[11] != -34 || local22[12] != 119 || local22[13] != 114 || local22[14] != -71 || local22[15] != 94 || local22[16] != 39 || local22[17] != -25 || local22[18] != 102 || local22[19] != 28) {
					return false;
				}
			} else if (local22[0] != 23 || local22[1] != 83 || local22[2] != 57 || local22[3] != 35 || local22[4] != 83 || local22[5] != -48 || local22[6] != 29 || local22[7] != -121 || local22[8] != 101 || local22[9] != 45 || local22[10] != -13 || local22[11] != -62 || local22[12] != -10 || local22[13] != 46 || local22[14] != -57 || local22[15] != -48 || local22[16] != 115 || local22[17] != 102 || local22[18] != 94 || local22[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(408) Exception local408) {
			this.method2920("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IILjava/io/File;)[B")
	private byte[] method2918(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) File arg3) {
		@Pc(4) byte[] local4 = this.method2915(arg3);
		if (!this.method2917(local4, arg1)) {
			local4 = this.method2919(arg1, false, arg0, arg2);
			if (local4 == null) {
				local4 = this.method2919(arg1, true, arg0, arg2);
			}
			if (local4 == null) {
				this.method2920("download");
				return null;
			}
			if (!this.method2916(arg3, local4)) {
				return null;
			}
			local4 = this.method2915(arg3);
			if (!this.method2917(local4, arg1)) {
				this.method2920("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean176 = true;
		this.aBoolean175 = this.aBoolean177 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(1) int local1 = 32;
			this.anInt4084 = Integer.parseInt(this.getParameter("width"));
			this.anInt4083 = Integer.parseInt(this.getParameter("height"));
			try {
				@Pc(18) int local18 = Integer.parseInt(this.getParameter("modewhat"));
				local1 += local18;
			} catch (@Pc(24) Exception local24) {
			}
			@Pc(26) String local26 = "Loading unpacker";
			@Pc(28) String local28 = "Loading game code";
			try {
				@Pc(32) String local32 = this.getParameter("lang");
				if (local32 != null && local32.equals("1")) {
					local26 = "Lade Entpacker";
					local28 = "Lade Spiel-Code";
				}
			} catch (@Pc(45) Exception local45) {
			}
			try {
				this.aClass92_1 = new Class92(true, this, local1, "runescape", 16);
			} catch (@Pc(57) Exception local57) {
				this.method2920("nocache");
				return;
			}
			@Pc(68) ClassLoader_Sub1 local68 = new ClassLoader_Sub1();
			@Pc(85) byte[] local85;
			try {
				Class.forName("java.util.jar.Pack200");
				local85 = this.method2918(local28, "runescape_1525208724.pack200", 281026, new File(this.aClass92_1.aFile5, "main_file_cache.dat0"));
				if (local85 == null) {
					return;
				}
				local68.aClass90_1 = new Class90_Sub1(local85);
			} catch (@Pc(98) Throwable local98) {
			}
			@Pc(127) Class local127;
			if (local68.aClass90_1 == null) {
				local85 = this.method2918(local26, "unpackclass_-163111980.jar", 19185, new File(this.aClass92_1.aFile5, "game_unpacker.dat"));
				if (local85 == null) {
					return;
				}
				local68.aClass90_1 = new Class90(local85);
				local127 = Class.forName("Class90");
				local68.aHashtable3.put(local127.getName(), local127);
				@Pc(138) Class local138 = local68.loadClass("unpackclass");
				local68 = new ClassLoader_Sub1();
				local85 = this.method2918(local28, "runescape_2114627885.js5", 288328, new File(this.aClass92_1.aFile5, "main_file_cache.dat1"));
				if (local85 == null) {
					return;
				}
				local68.aClass90_1 = (Class90) local138.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local85, Boolean.TRUE);
			}
			local127 = Class.forName("Class93");
			local68.aHashtable3.put(local127.getName(), local127);
			@Pc(200) Class local200 = Class.forName("Class92");
			local68.aHashtable3.put(local200.getName(), local200);
			local127 = Class.forName("Class91");
			local68.aHashtable3.put(local127.getName(), local127);
			local127 = Class.forName("Interface4");
			local68.aHashtable3.put(local127.getName(), local127);
			local127 = local68.loadClass("client");
			synchronized (this) {
				if (this.aBoolean176) {
					return;
				}
				this.anApplet2 = (Applet) local127.getDeclaredConstructor().newInstance();
				local127.getMethod("providesignlink", local200).invoke(null, this.aClass92_1);
				this.anApplet2.init();
				if (this.aBoolean175) {
					this.anApplet2.start();
				}
				if (this.aBoolean177) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(292) Exception local292) {
			RuntimeException_Sub2.anInt4078 = 2114627885;
			if (local292 instanceof InvocationTargetException) {
				@Pc(301) Throwable local301 = ((InvocationTargetException) local292).getTargetException();
				if (local301 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2914(this, local292.toString(), local301);
			} else {
				RuntimeException_Sub2.method2914(this, null, local292);
			}
			this.method2920("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean177 = true;
		this.aBoolean175 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean176 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;IB)[B")
	private byte[] method2919(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(15) byte[] local15 = new byte[arg3];
		@Pc(20) Color local20 = new Color(9179409);
		try {
			@Pc(30) InputStream local30;
			if (arg1) {
				@Pc(35) URL local35 = this.getCodeBase();
				@Pc(43) Socket local43 = new Socket(InetAddress.getByName(local35.getHost()), 443);
				local43.setSoTimeout(10000);
				@Pc(49) OutputStream local49 = local43.getOutputStream();
				local49.write(17);
				local49.write(("JAGGRAB " + local35.getFile() + arg0 + "\n\n").getBytes());
				local30 = local43.getInputStream();
			} else {
				local30 = (new URL(this.getCodeBase(), arg0)).openStream();
			}
			@Pc(73) int local73 = -1;
			@Pc(75) int local75 = 0;
			while (local15.length > local75) {
				@Pc(89) int local89 = local15.length - local75;
				if (local89 > 1000) {
					local89 = 1000;
				}
				@Pc(102) int local102 = local30.read(local15, local75, local89);
				if (local102 < 0) {
					throw new EOFException();
				}
				local75 += local102;
				@Pc(120) int local120 = local75 * 100 / local15.length;
				if (local120 != local73) {
					try {
						@Pc(131) Graphics local131 = this.getGraphics();
						if (local131 == null) {
							this.repaint();
						} else {
							@Pc(150) String local150 = arg2 + " - " + local120 + "%";
							local131.setColor(Color.black);
							local131.fillRect(0, 0, this.anInt4084, this.anInt4083);
							local73 = local120;
							local131.setColor(local20);
							local131.drawRect(this.anInt4084 / 2 - 152, this.anInt4083 / 2 - 18, 303, 33);
							local131.setFont(local8);
							local131.setColor(Color.white);
							local131.drawString(local150, (this.anInt4084 - local12.stringWidth(local150)) / 2, this.anInt4083 / 2 + 4);
						}
					} catch (@Pc(207) Exception local207) {
					}
				}
			}
			local30.close();
		} catch (@Pc(213) IOException local213) {
			return null;
		}
		return this.method2917(local15, arg0) ? local15 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method2920(@OriginalArg(1) String arg0) {
		if (this.aBoolean178) {
			return;
		}
		this.aBoolean178 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(26) Exception local26) {
		}
	}
}
