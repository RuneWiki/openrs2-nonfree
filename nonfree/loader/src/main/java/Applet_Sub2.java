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
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt4174;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt4175;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Lloader!e;")
	private Class95 aClass95_1;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean327;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean328;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean329;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean326;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;)[B")
	private byte[] method3087(@OriginalArg(1) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean328 = true;
		this.aBoolean327 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BBLjava/lang/String;)Z")
	private boolean method3088(@OriginalArg(0) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(7) MessageDigest local7 = MessageDigest.getInstance("SHA");
			local7.reset();
			local7.update(arg0);
			@Pc(21) byte[] local21 = local7.digest();
			if (arg1 == "runescape_1641243077.pack200") {
				if (local21[0] != 70 || local21[1] != 54 || local21[2] != 0 || local21[3] != 7 || local21[4] != 125 || local21[5] != 25 || local21[6] != 91 || local21[7] != -109 || local21[8] != -22 || local21[9] != -87 || local21[10] != 21 || local21[11] != 58 || local21[12] != 1 || local21[13] != -38 || local21[14] != -20 || local21[15] != -70 || local21[16] != 25 || local21[17] != 72 || local21[18] != -85 || local21[19] != -14) {
					return false;
				}
			} else if (arg1 == "runescape_399175086.js5") {
				if (local21[0] != 114 || local21[1] != -1 || local21[2] != 4 || local21[3] != -78 || local21[4] != 50 || local21[5] != 84 || local21[6] != -1 || local21[7] != 70 || local21[8] != 84 || local21[9] != -42 || local21[10] != 87 || local21[11] != 69 || local21[12] != 60 || local21[13] != 61 || local21[14] != 110 || local21[15] != -4 || local21[16] != -124 || local21[17] != -94 || local21[18] != -69 || local21[19] != -52) {
					return false;
				}
			} else if (local21[0] != 23 || local21[1] != 83 || local21[2] != 57 || local21[3] != 35 || local21[4] != 83 || local21[5] != -48 || local21[6] != 29 || local21[7] != -121 || local21[8] != 101 || local21[9] != 45 || local21[10] != -13 || local21[11] != -62 || local21[12] != -10 || local21[13] != 46 || local21[14] != -57 || local21[15] != -48 || local21[16] != 115 || local21[17] != 102 || local21[18] != 94 || local21[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(399) Exception local399) {
			this.method3091("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;ILjava/io/File;Ljava/lang/String;)[B")
	private byte[] method3089(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) File arg2, @OriginalArg(4) String arg3) {
		@Pc(9) byte[] local9 = this.method3087(arg2);
		if (!this.method3088(local9, arg3)) {
			local9 = this.method3092(arg3, arg0, false, arg1);
			if (local9 == null) {
				local9 = this.method3092(arg3, arg0, true, arg1);
			}
			if (local9 == null) {
				this.method3091("download");
				return null;
			}
			if (!this.method3090(local9, arg2)) {
				return null;
			}
			local9 = this.method3087(arg2);
			if (!this.method3088(local9, arg3)) {
				this.method3091("mismatch");
				return null;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean327 = true;
		this.aBoolean328 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean326 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean328 = this.aBoolean327 = false;
		this.aBoolean326 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;B)Z")
	private boolean method3090(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			this.method3091("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(1) int local1 = 32;
			this.anInt4175 = Integer.parseInt(this.getParameter("width"));
			this.anInt4174 = Integer.parseInt(this.getParameter("height"));
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
				this.aClass95_1 = new Class95(true, this, local1, "runescape", 16);
			} catch (@Pc(56) Exception local56) {
				this.method3091("nocache");
				return;
			}
			@Pc(65) ClassLoader_Sub1 local65 = new ClassLoader_Sub1();
			@Pc(84) byte[] local84;
			try {
				Class.forName("java.util.jar.Pack200");
				local84 = this.method3089(286815, local26, new File(this.aClass95_1.aFile4, "main_file_cache.dat0"), "runescape_1641243077.pack200");
				if (local84 == null) {
					return;
				}
				local65.aClass94_1 = new Class94_Sub1(local84);
			} catch (@Pc(96) Throwable local96) {
			}
			@Pc(126) Class local126;
			if (local65.aClass94_1 == null) {
				local84 = this.method3089(19185, local28, new File(this.aClass95_1.aFile4, "game_unpacker.dat"), "unpackclass_-163111980.jar");
				if (local84 == null) {
					return;
				}
				local65.aClass94_1 = new Class94(local84);
				local126 = Class.forName("Class94");
				local65.aHashtable1.put(local126.getName(), local126);
				@Pc(137) Class local137 = local65.loadClass("unpackclass");
				local65 = new ClassLoader_Sub1();
				local84 = this.method3089(294710, local26, new File(this.aClass95_1.aFile4, "main_file_cache.dat1"), "runescape_399175086.js5");
				if (local84 == null) {
					return;
				}
				local65.aClass94_1 = (Class94) local137.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local84, Boolean.TRUE);
			}
			local126 = Class.forName("Class97");
			local65.aHashtable1.put(local126.getName(), local126);
			@Pc(200) Class local200 = Class.forName("Class95");
			local65.aHashtable1.put(local200.getName(), local200);
			local126 = Class.forName("Class96");
			local65.aHashtable1.put(local126.getName(), local126);
			local126 = Class.forName("Interface4");
			local65.aHashtable1.put(local126.getName(), local126);
			local126 = local65.loadClass("client");
			synchronized (this) {
				if (this.aBoolean326) {
					return;
				}
				this.anApplet3 = (Applet) local126.getDeclaredConstructor().newInstance();
				local126.getMethod("providesignlink", local200).invoke(null, this.aClass95_1);
				this.anApplet3.init();
				if (this.aBoolean328) {
					this.anApplet3.start();
				}
				if (this.aBoolean327) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(292) Exception local292) {
			RuntimeException_Sub2.anInt4169 = 399175086;
			if (local292 instanceof InvocationTargetException) {
				@Pc(301) Throwable local301 = ((InvocationTargetException) local292).getTargetException();
				if (local301 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method3067(local292.toString(), this, local301);
			} else {
				RuntimeException_Sub2.method3067(null, this, local292);
			}
			this.method3091("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method3091(@OriginalArg(0) String arg0) {
		if (this.aBoolean329) {
			return;
		}
		this.aBoolean329 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(27) Exception local27) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;IZLjava/lang/String;)[B")
	private byte[] method3092(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(22) byte[] local22 = new byte[arg1];
		@Pc(27) Color local27 = new Color(9179409);
		try {
			@Pc(37) InputStream local37;
			if (arg2) {
				@Pc(42) URL local42 = this.getCodeBase();
				@Pc(50) Socket local50 = new Socket(InetAddress.getByName(local42.getHost()), 443);
				local50.setSoTimeout(10000);
				@Pc(56) OutputStream local56 = local50.getOutputStream();
				local56.write(17);
				local56.write(("JAGGRAB " + local42.getFile() + arg0 + "\n\n").getBytes());
				local37 = local50.getInputStream();
			} else {
				local37 = (new URL(this.getCodeBase(), arg0)).openStream();
			}
			@Pc(80) int local80 = -1;
			@Pc(82) int local82 = 0;
			while (local82 < local22.length) {
				@Pc(91) int local91 = local22.length - local82;
				if (local91 > 1000) {
					local91 = 1000;
				}
				@Pc(102) int local102 = local37.read(local22, local82, local91);
				if (local102 < 0) {
					throw new EOFException();
				}
				local82 += local102;
				@Pc(122) int local122 = local82 * 100 / local22.length;
				if (local80 != local122) {
					try {
						@Pc(128) Graphics local128 = this.getGraphics();
						if (local128 == null) {
							this.repaint();
						} else {
							local80 = local122;
							local128.setColor(Color.black);
							@Pc(148) String local148 = arg3 + " - " + local122 + "%";
							local128.fillRect(0, 0, this.anInt4175, this.anInt4174);
							local128.setColor(local27);
							local128.drawRect(this.anInt4175 / 2 - 152, this.anInt4174 / 2 + -18, 303, 33);
							local128.setFont(local8);
							local128.setColor(Color.white);
							local128.drawString(local148, (this.anInt4175 - local12.stringWidth(local148)) / 2, this.anInt4174 / 2 + 4);
						}
					} catch (@Pc(205) Exception local205) {
					}
				}
			}
			local37.close();
		} catch (@Pc(211) IOException local211) {
			return null;
		}
		return this.method3088(local22, arg0) ? local22 : null;
	}
}
