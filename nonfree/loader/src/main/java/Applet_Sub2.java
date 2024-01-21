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
	private int anInt4210;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt4211;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Lloader!ih;")
	private Class93 aClass93_1;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean179;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean178;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean180;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean181;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method2836(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(19) int local19 = (int) arg0.length();
			@Pc(30) DataInputStream local30 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(33) byte[] local33 = new byte[local19];
			local30.readFully(local33, 0, local19);
			local30.close();
			return local33;
		} catch (@Pc(43) IOException local43) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B[BLjava/io/File;)Z")
	private boolean method2837(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			this.method2839("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;ILjava/io/File;ILjava/lang/String;)[B")
	private byte[] method2838(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) File arg2, @OriginalArg(4) String arg3) {
		@Pc(4) byte[] local4 = this.method2836(arg2);
		if (!this.method2841(local4, arg3)) {
			local4 = this.method2840(arg3, arg0, false, arg1);
			if (local4 == null) {
				local4 = this.method2840(arg3, arg0, true, arg1);
			}
			if (local4 == null) {
				this.method2839("download");
				return null;
			}
			if (!this.method2837(local4, arg2)) {
				return null;
			}
			local4 = this.method2836(arg2);
			if (!this.method2841(local4, arg3)) {
				this.method2839("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method2839(@OriginalArg(0) String arg0) {
		if (this.aBoolean181) {
			return;
		}
		this.aBoolean181 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(26) Exception local26) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean180 = true;
		this.aBoolean178 = this.aBoolean179 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ZI)[B")
	private byte[] method2840(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(15) byte[] local15 = new byte[arg3];
		@Pc(20) Color local20 = new Color(9179409);
		try {
			@Pc(69) InputStream local69;
			if (arg2) {
				@Pc(33) URL local33 = this.getCodeBase();
				@Pc(41) Socket local41 = new Socket(InetAddress.getByName(local33.getHost()), 443);
				local41.setSoTimeout(10000);
				@Pc(47) OutputStream local47 = local41.getOutputStream();
				local47.write(17);
				local47.write(("JAGGRAB " + local33.getFile() + arg0 + "\n\n").getBytes());
				local69 = local41.getInputStream();
			} else {
				local69 = (new URL(this.getCodeBase(), arg0)).openStream();
			}
			@Pc(81) int local81 = -1;
			@Pc(83) int local83 = 0;
			while (local83 < local15.length) {
				@Pc(97) int local97 = local15.length - local83;
				if (local97 > 1000) {
					local97 = 1000;
				}
				@Pc(110) int local110 = local69.read(local15, local83, local97);
				if (local110 < 0) {
					throw new EOFException();
				}
				local83 += local110;
				@Pc(127) int local127 = local83 * 100 / local15.length;
				if (local127 != local81) {
					try {
						@Pc(137) Graphics local137 = this.getGraphics();
						if (local137 == null) {
							this.repaint();
						} else {
							local81 = local127;
							local137.setColor(Color.black);
							@Pc(162) String local162 = arg1 + " - " + local127 + "%";
							local137.fillRect(0, 0, this.anInt4210, this.anInt4211);
							local137.setColor(local20);
							local137.drawRect(this.anInt4210 / 2 - 152, this.anInt4211 / 2 - 18, 303, 33);
							local137.setFont(local8);
							local137.setColor(Color.white);
							local137.drawString(local162, (this.anInt4210 - local12.stringWidth(local162)) / 2, this.anInt4211 / 2 + 4);
						}
					} catch (@Pc(214) Exception local214) {
					}
				}
			}
			local69.close();
		} catch (@Pc(220) IOException local220) {
			return null;
		}
		return this.method2841(local15, arg0) ? local15 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean178 = false;
		this.aBoolean179 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/lang/String;I)Z")
	private boolean method2841(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg0);
			@Pc(16) byte[] local16 = local8.digest();
			if (arg1 == "runescape_-469691293.pack200") {
				if (local16[0] != -124 || local16[1] != -116 || local16[2] != -43 || local16[3] != -21 || local16[4] != -105 || local16[5] != -30 || local16[6] != -71 || local16[7] != 15 || local16[8] != -23 || local16[9] != -47 || local16[10] != 105 || local16[11] != -69 || local16[12] != 36 || local16[13] != 72 || local16[14] != -1 || local16[15] != -114 || local16[16] != 99 || local16[17] != 9 || local16[18] != 126 || local16[19] != -14) {
					return false;
				}
			} else if (arg1 == "runescape_-858832900.js5") {
				if (local16[0] != -74 || local16[1] != -105 || local16[2] != 13 || local16[3] != 55 || local16[4] != -117 || local16[5] != -36 || local16[6] != 37 || local16[7] != -99 || local16[8] != -74 || local16[9] != 123 || local16[10] != 108 || local16[11] != -28 || local16[12] != 57 || local16[13] != -120 || local16[14] != -71 || local16[15] != 18 || local16[16] != 38 || local16[17] != 114 || local16[18] != 16 || local16[19] != 91) {
					return false;
				}
			} else if (local16[0] != 23 || local16[1] != 83 || local16[2] != 57 || local16[3] != 35 || local16[4] != 83 || local16[5] != -48 || local16[6] != 29 || local16[7] != -121 || local16[8] != 101 || local16[9] != 45 || local16[10] != -13 || local16[11] != -62 || local16[12] != -10 || local16[13] != 46 || local16[14] != -57 || local16[15] != -48 || local16[16] != 115 || local16[17] != 102 || local16[18] != 94 || local16[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(395) Exception local395) {
			this.method2839("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean180 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean178 = true;
		this.aBoolean179 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt4210 = Integer.parseInt(this.getParameter("width"));
			this.anInt4211 = Integer.parseInt(this.getParameter("height"));
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
			} catch (@Pc(44) Exception local44) {
			}
			try {
				this.aClass93_1 = new Class93(true, this, local13, "runescape", 16);
			} catch (@Pc(56) Exception local56) {
				this.method2839("nocache");
				return;
			}
			@Pc(67) ClassLoader_Sub1 local67 = new ClassLoader_Sub1();
			@Pc(84) byte[] local84;
			try {
				Class.forName("java.util.jar.Pack200");
				local84 = this.method2838(local28, 280006, new File(this.aClass93_1.aFile5, "main_file_cache.dat0"), "runescape_-469691293.pack200");
				if (local84 == null) {
					return;
				}
				local67.aClass91_1 = new Class91_Sub1(local84);
			} catch (@Pc(96) Throwable local96) {
			}
			@Pc(128) Class local128;
			if (local67.aClass91_1 == null) {
				local84 = this.method2838(local26, 19185, new File(this.aClass93_1.aFile5, "game_unpacker.dat"), "unpackclass_-163111980.jar");
				if (local84 == null) {
					return;
				}
				local67.aClass91_1 = new Class91(local84);
				local128 = Class.forName("Class91");
				local67.aHashtable1.put(local128.getName(), local128);
				@Pc(139) Class local139 = local67.loadClass("unpackclass");
				local67 = new ClassLoader_Sub1();
				local84 = this.method2838(local28, 284764, new File(this.aClass93_1.aFile5, "main_file_cache.dat1"), "runescape_-858832900.js5");
				if (local84 == null) {
					return;
				}
				local67.aClass91_1 = (Class91) local139.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local84, Boolean.TRUE);
			}
			local128 = Class.forName("Class94");
			local67.aHashtable1.put(local128.getName(), local128);
			@Pc(202) Class local202 = Class.forName("Class93");
			local67.aHashtable1.put(local202.getName(), local202);
			local128 = Class.forName("Class92");
			local67.aHashtable1.put(local128.getName(), local128);
			local128 = Class.forName("Interface4");
			local67.aHashtable1.put(local128.getName(), local128);
			local128 = local67.loadClass("client");
			synchronized (this) {
				if (this.aBoolean180) {
					return;
				}
				this.anApplet3 = (Applet) local128.getDeclaredConstructor().newInstance();
				local128.getMethod("providesignlink", local202).invoke(null, this.aClass93_1);
				this.anApplet3.init();
				if (this.aBoolean178) {
					this.anApplet3.start();
				}
				if (this.aBoolean179) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(294) Exception local294) {
			RuntimeException_Sub2.anInt4205 = -858832900;
			if (local294 instanceof InvocationTargetException) {
				@Pc(303) Throwable local303 = ((InvocationTargetException) local294).getTargetException();
				if (local303 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2824(local294.toString(), this, local303);
			} else {
				RuntimeException_Sub2.method2824(null, this, local294);
			}
			this.method2839("crash");
		}
	}
}
