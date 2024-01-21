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
	private int anInt4293;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt4294;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Lloader!qf;")
	private Class93 aClass93_1;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean205;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean206;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean207;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean208;

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean207 = false;
		this.aBoolean205 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;Ljava/io/File;Ljava/lang/String;B)[B")
	private byte[] method3232(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) File arg2, @OriginalArg(3) String arg3) {
		@Pc(4) byte[] local4 = this.method3237(arg2);
		if (!this.method3236(local4, arg1)) {
			local4 = this.method3235(arg1, arg0, false, arg3);
			if (local4 == null) {
				local4 = this.method3235(arg1, arg0, true, arg3);
			}
			if (local4 == null) {
				this.method3233("download");
				return null;
			}
			if (!this.method3234(local4, arg2)) {
				return null;
			}
			local4 = this.method3237(arg2);
			if (!this.method3236(local4, arg1)) {
				this.method3233("mismatch");
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
			this.anInt4294 = Integer.parseInt(this.getParameter("width"));
			this.anInt4293 = Integer.parseInt(this.getParameter("height"));
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
				this.aClass93_1 = new Class93(true, this, local1, "runescape", 16);
			} catch (@Pc(57) Exception local57) {
				this.method3233("nocache");
				return;
			}
			@Pc(68) ClassLoader_Sub1 local68 = new ClassLoader_Sub1();
			@Pc(85) byte[] local85;
			try {
				Class.forName("java.util.jar.Pack200");
				local85 = this.method3232(275903, "runescape_-816068201.pack200", new File(this.aClass93_1.aFile5, "main_file_cache.dat0"), local26);
				if (local85 == null) {
					return;
				}
				local68.aClass90_1 = new Class90_Sub1(local85);
			} catch (@Pc(97) Throwable local97) {
			}
			@Pc(128) Class local128;
			if (local68.aClass90_1 == null) {
				local85 = this.method3232(19185, "unpackclass_-163111980.jar", new File(this.aClass93_1.aFile5, "game_unpacker.dat"), local28);
				if (local85 == null) {
					return;
				}
				local68.aClass90_1 = new Class90(local85);
				local128 = Class.forName("Class90");
				local68.aHashtable1.put(local128.getName(), local128);
				@Pc(139) Class local139 = local68.loadClass("unpackclass");
				local68 = new ClassLoader_Sub1();
				local85 = this.method3232(286558, "runescape_93089163.js5", new File(this.aClass93_1.aFile5, "main_file_cache.dat1"), local26);
				if (local85 == null) {
					return;
				}
				local68.aClass90_1 = (Class90) local139.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local85, Boolean.TRUE);
			}
			local128 = Class.forName("Class91");
			local68.aHashtable1.put(local128.getName(), local128);
			@Pc(200) Class local200 = Class.forName("Class93");
			local68.aHashtable1.put(local200.getName(), local200);
			local128 = Class.forName("Class92");
			local68.aHashtable1.put(local128.getName(), local128);
			local128 = Class.forName("Interface4");
			local68.aHashtable1.put(local128.getName(), local128);
			local128 = local68.loadClass("client");
			synchronized (this) {
				if (this.aBoolean206) {
					return;
				}
				this.anApplet2 = (Applet) local128.getDeclaredConstructor().newInstance();
				local128.getMethod("providesignlink", local200).invoke(null, this.aClass93_1);
				this.anApplet2.init();
				if (this.aBoolean207) {
					this.anApplet2.start();
				}
				if (this.aBoolean205) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(293) Exception local293) {
			RuntimeException_Sub2.anInt4292 = 93089163;
			if (local293 instanceof InvocationTargetException) {
				@Pc(302) Throwable local302 = ((InvocationTargetException) local293).getTargetException();
				if (local302 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method3215(local302, this, local293.toString());
			} else {
				RuntimeException_Sub2.method3215(local293, this, null);
			}
			this.method3233("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean207 = this.aBoolean205 = false;
		this.aBoolean206 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method3233(@OriginalArg(0) String arg0) {
		if (this.aBoolean208) {
			return;
		}
		this.aBoolean208 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;B)Z")
	private boolean method3234(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method3233("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;IBZLjava/lang/String;)[B")
	private byte[] method3235(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(15) byte[] local15 = new byte[arg1];
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
			@Pc(73) int local73 = 0;
			@Pc(75) int local75 = -1;
			while (local73 < local15.length) {
				@Pc(85) int local85 = local15.length - local73;
				if (local85 > 1000) {
					local85 = 1000;
				}
				@Pc(96) int local96 = local61.read(local15, local73, local85);
				if (local96 < 0) {
					throw new EOFException();
				}
				local73 += local96;
				@Pc(116) int local116 = local73 * 100 / local15.length;
				if (local75 != local116) {
					try {
						@Pc(122) Graphics local122 = this.getGraphics();
						if (local122 == null) {
							this.repaint();
						} else {
							local75 = local116;
							local122.setColor(Color.black);
							@Pc(143) String local143 = arg3 + " - " + local116 + "%";
							local122.fillRect(0, 0, this.anInt4294, this.anInt4293);
							local122.setColor(local20);
							local122.drawRect(this.anInt4294 / 2 - 152, this.anInt4293 / 2 + -18, 303, 33);
							local122.setFont(local8);
							local122.setColor(Color.white);
							local122.drawString(local143, (this.anInt4294 - local12.stringWidth(local143)) / 2, this.anInt4293 / 2 + 4);
						}
					} catch (@Pc(200) Exception local200) {
					}
				}
			}
			local61.close();
		} catch (@Pc(219) IOException local219) {
			return null;
		}
		return this.method3236(local15, arg0) ? local15 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/lang/String;B)Z")
	private boolean method3236(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg0);
			@Pc(22) byte[] local22 = local8.digest();
			if (arg1 == "runescape_-816068201.pack200") {
				if (local22[0] != 76 || local22[1] != -65 || local22[2] != 75 || local22[3] != -34 || local22[4] != 66 || local22[5] != -20 || local22[6] != 126 || local22[7] != -104 || local22[8] != -65 || local22[9] != -89 || local22[10] != -102 || local22[11] != 35 || local22[12] != 94 || local22[13] != -77 || local22[14] != 62 || local22[15] != -110 || local22[16] != -120 || local22[17] != 123 || local22[18] != -70 || local22[19] != 14) {
					return false;
				}
			} else if (arg1 == "runescape_93089163.js5") {
				if (local22[0] != 12 || local22[1] != 92 || local22[2] != 71 || local22[3] != 102 || local22[4] != 42 || local22[5] != 91 || local22[6] != -34 || local22[7] != 84 || local22[8] != -23 || local22[9] != 48 || local22[10] != 11 || local22[11] != 83 || local22[12] != -7 || local22[13] != -46 || local22[14] != 49 || local22[15] != -44 || local22[16] != -2 || local22[17] != 126 || local22[18] != 35 || local22[19] != 61) {
					return false;
				}
			} else if (local22[0] != 23 || local22[1] != 83 || local22[2] != 57 || local22[3] != 35 || local22[4] != 83 || local22[5] != -48 || local22[6] != 29 || local22[7] != -121 || local22[8] != 101 || local22[9] != 45 || local22[10] != -13 || local22[11] != -62 || local22[12] != -10 || local22[13] != 46 || local22[14] != -57 || local22[15] != -48 || local22[16] != 115 || local22[17] != 102 || local22[18] != 94 || local22[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(397) Exception local397) {
			this.method3233("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean205 = false;
		this.aBoolean207 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method3237(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(8) int local8 = (int) arg0.length();
			@Pc(19) DataInputStream local19 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(22) byte[] local22 = new byte[local8];
			local19.readFully(local22, 0, local8);
			local19.close();
			return local22;
		} catch (@Pc(32) IOException local32) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean206 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}
}
