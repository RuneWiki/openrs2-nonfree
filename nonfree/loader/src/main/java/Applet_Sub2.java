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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Lloader!u;")
	private Class86 aClass86_1;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt3493;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt3494;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean134;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;II)[B")
	private byte[] method2325(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(11) byte[] local11 = new byte[arg3];
		@Pc(28) FontMetrics local28 = this.getFontMetrics(local8);
		@Pc(33) Color local33 = new Color(9179409);
		try {
			@Pc(43) InputStream local43;
			if (arg1) {
				@Pc(48) URL local48 = this.getCodeBase();
				@Pc(56) Socket local56 = new Socket(InetAddress.getByName(local48.getHost()), 443);
				local56.setSoTimeout(10000);
				@Pc(62) OutputStream local62 = local56.getOutputStream();
				local62.write(17);
				local62.write(("JAGGRAB " + local48.getFile() + arg2 + "\n\n").getBytes());
				local43 = local56.getInputStream();
			} else {
				local43 = (new URL(this.getCodeBase(), arg2)).openStream();
			}
			@Pc(86) int local86 = -1;
			@Pc(88) int local88 = 0;
			while (local11.length > local88) {
				@Pc(102) int local102 = local11.length - local88;
				if (local102 > 1000) {
					local102 = 1000;
				}
				@Pc(113) int local113 = local43.read(local11, local88, local102);
				if (local113 < 0) {
					throw new EOFException();
				}
				local88 += local113;
				@Pc(134) int local134 = local88 * 100 / local11.length;
				if (local134 != local86) {
					try {
						@Pc(141) Graphics local141 = this.getGraphics();
						if (local141 == null) {
							this.repaint();
						} else {
							local141.setColor(Color.black);
							@Pc(159) String local159 = arg0 + " - " + local134 + "%";
							local86 = local134;
							local141.fillRect(0, 0, this.anInt3494, this.anInt3493);
							local141.setColor(local33);
							local141.drawRect(this.anInt3494 / 2 - 152, this.anInt3493 / 2 + -18, 303, 33);
							local141.setFont(local8);
							local141.setColor(Color.white);
							local141.drawString(local159, (this.anInt3494 - local28.stringWidth(local159)) / 2, this.anInt3493 / 2 + 4);
						}
					} catch (@Pc(218) Exception local218) {
					}
				}
			}
			local43.close();
		} catch (@Pc(224) IOException local224) {
			return null;
		}
		return this.method2330(arg2, local11) ? local11 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Z[BLjava/io/File;)Z")
	private boolean method2326(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(22) IOException local22) {
			this.method2329("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;)[B")
	private byte[] method2327(@OriginalArg(1) File arg0) {
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
		} catch (@Pc(42) IOException local42) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;ILjava/io/File;)[B")
	private byte[] method2328(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(4) File arg3) {
		@Pc(4) byte[] local4 = this.method2327(arg3);
		if (!this.method2330(arg1, local4)) {
			local4 = this.method2325(arg2, false, arg1, arg0);
			if (local4 == null) {
				local4 = this.method2325(arg2, true, arg1, arg0);
			}
			if (local4 == null) {
				this.method2329("download");
				return null;
			}
			if (!this.method2326(local4, arg3)) {
				return null;
			}
			local4 = this.method2327(arg3);
			if (!this.method2330(arg1, local4)) {
				this.method2329("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method2329(@OriginalArg(1) String arg0) {
		if (this.aBoolean134) {
			return;
		}
		this.aBoolean134 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(33) Exception local33) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(1) int local1 = 32;
			this.anInt3494 = Integer.parseInt(this.getParameter("width"));
			this.anInt3493 = Integer.parseInt(this.getParameter("height"));
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
			} catch (@Pc(46) Exception local46) {
			}
			try {
				this.aClass86_1 = new Class86(true, this, local1, "runescape", 16);
			} catch (@Pc(58) Exception local58) {
				this.method2329("nocache");
				return;
			}
			@Pc(69) ClassLoader_Sub1 local69 = new ClassLoader_Sub1();
			@Pc(86) byte[] local86;
			try {
				Class.forName("java.util.jar.Pack200");
				local86 = this.method2328(265995, "runescape_2025992925.pack200", local26, new File(this.aClass86_1.aFile6, "main_file_cache.dat0"));
				if (local86 == null) {
					return;
				}
				local69.aClass84_1 = new Class84_Sub1(local86);
			} catch (@Pc(98) Throwable local98) {
			}
			@Pc(131) Class local131;
			if (local69.aClass84_1 == null) {
				local86 = this.method2328(19185, "unpackclass_-163111980.jar", local28, new File(this.aClass86_1.aFile6, "game_unpacker.dat"));
				if (local86 == null) {
					return;
				}
				local69.aClass84_1 = new Class84(local86);
				local131 = Class.forName("Class84");
				local69.aHashtable1.put(local131.getName(), local131);
				@Pc(142) Class local142 = local69.loadClass("unpackclass");
				local69 = new ClassLoader_Sub1();
				local86 = this.method2328(259895, "runescape_-612386498.js5", local26, new File(this.aClass86_1.aFile6, "main_file_cache.dat1"));
				if (local86 == null) {
					return;
				}
				local69.aClass84_1 = (Class84) local142.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local86, Boolean.TRUE);
			}
			local131 = Class.forName("Class85");
			local69.aHashtable1.put(local131.getName(), local131);
			@Pc(205) Class local205 = Class.forName("Class86");
			local69.aHashtable1.put(local205.getName(), local205);
			local131 = Class.forName("Class83");
			local69.aHashtable1.put(local131.getName(), local131);
			local131 = Class.forName("Interface4");
			local69.aHashtable1.put(local131.getName(), local131);
			local131 = local69.loadClass("client");
			this.anApplet2 = (Applet) local131.getDeclaredConstructor().newInstance();
			local131.getMethod("providesignlink", local205).invoke(null, this.aClass86_1);
			this.anApplet2.init();
			this.anApplet2.start();
		} catch (@Pc(268) Exception local268) {
			RuntimeException_Sub2.anInt3488 = -612386498;
			if (local268 instanceof InvocationTargetException) {
				@Pc(277) Throwable local277 = ((InvocationTargetException) local268).getTargetException();
				if (local277 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2313(local268.toString(), local277, this);
			} else {
				RuntimeException_Sub2.method2313(null, local268, this);
			}
			this.method2329("crash");
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

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B[B)Z")
	private boolean method2330(@OriginalArg(0) String arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(12) MessageDigest local12 = MessageDigest.getInstance("SHA");
			local12.reset();
			local12.update(arg1);
			@Pc(20) byte[] local20 = local12.digest();
			if (arg0 == "runescape_2025992925.pack200") {
				if (local20[0] != 35 || local20[1] != 104 || local20[2] != 11 || local20[3] != -15 || local20[4] != -113 || local20[5] != -126 || local20[6] != -30 || local20[7] != 75 || local20[8] != 15 || local20[9] != -93 || local20[10] != -88 || local20[11] != -73 || local20[12] != 14 || local20[13] != -58 || local20[14] != -39 || local20[15] != -118 || local20[16] != -84 || local20[17] != 34 || local20[18] != -69 || local20[19] != 104) {
					return false;
				}
			} else if (arg0 == "runescape_-612386498.js5") {
				if (local20[0] != -42 || local20[1] != 21 || local20[2] != -49 || local20[3] != 30 || local20[4] != 117 || local20[5] != 62 || local20[6] != 93 || local20[7] != 14 || local20[8] != -53 || local20[9] != -120 || local20[10] != 119 || local20[11] != -80 || local20[12] != 17 || local20[13] != -11 || local20[14] != 15 || local20[15] != 88 || local20[16] != 5 || local20[17] != 56 || local20[18] != 70 || local20[19] != 25) {
					return false;
				}
			} else if (local20[0] != 23 || local20[1] != 83 || local20[2] != 57 || local20[3] != 35 || local20[4] != 83 || local20[5] != -48 || local20[6] != 29 || local20[7] != -121 || local20[8] != 101 || local20[9] != 45 || local20[10] != -13 || local20[11] != -62 || local20[12] != -10 || local20[13] != 46 || local20[14] != -57 || local20[15] != -48 || local20[16] != 115 || local20[17] != 102 || local20[18] != 94 || local20[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(400) Exception local400) {
			this.method2329("sha");
			return false;
		}
	}
}
