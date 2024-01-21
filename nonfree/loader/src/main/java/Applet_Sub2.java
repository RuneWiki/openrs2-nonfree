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
	private int anInt4384;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Lloader!rf;")
	private Class94 aClass94_1;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt4385;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean221;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean223;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean222;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean224;

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean221 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BZLjava/lang/String;)Z")
	private boolean method3175(@OriginalArg(0) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(7) MessageDigest local7 = MessageDigest.getInstance("SHA");
			local7.reset();
			local7.update(arg0);
			@Pc(15) byte[] local15 = local7.digest();
			if (arg1 == "runescape_1713272294.pack200") {
				if (local15[0] != -113 || local15[1] != -71 || local15[2] != 0 || local15[3] != 30 || local15[4] != -57 || local15[5] != 28 || local15[6] != -104 || local15[7] != -5 || local15[8] != -31 || local15[9] != 101 || local15[10] != -106 || local15[11] != -57 || local15[12] != 40 || local15[13] != -37 || local15[14] != 65 || local15[15] != 45 || local15[16] != 17 || local15[17] != 90 || local15[18] != -66 || local15[19] != -67) {
					return false;
				}
			} else if (arg1 == "runescape_443776249.js5") {
				if (local15[0] != -52 || local15[1] != -104 || local15[2] != 59 || local15[3] != -39 || local15[4] != 50 || local15[5] != -8 || local15[6] != -4 || local15[7] != 49 || local15[8] != 127 || local15[9] != 54 || local15[10] != 102 || local15[11] != 78 || local15[12] != 16 || local15[13] != 113 || local15[14] != -52 || local15[15] != 105 || local15[16] != -74 || local15[17] != 7 || local15[18] != 109 || local15[19] != -50) {
					return false;
				}
			} else if (local15[0] != 23 || local15[1] != 83 || local15[2] != 57 || local15[3] != 35 || local15[4] != 83 || local15[5] != -48 || local15[6] != 29 || local15[7] != -121 || local15[8] != 101 || local15[9] != 45 || local15[10] != -13 || local15[11] != -62 || local15[12] != -10 || local15[13] != 46 || local15[14] != -57 || local15[15] != -48 || local15[16] != 115 || local15[17] != 102 || local15[18] != 94 || local15[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(397) Exception local397) {
			this.method3177("sha");
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

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method3176(@OriginalArg(1) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method3177(@OriginalArg(1) String arg0) {
		if (this.aBoolean224) {
			return;
		}
		this.aBoolean224 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(27) Exception local27) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean222 = true;
		this.aBoolean223 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(1) int local1 = 32;
			this.anInt4384 = Integer.parseInt(this.getParameter("width"));
			this.anInt4385 = Integer.parseInt(this.getParameter("height"));
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
				this.aClass94_1 = new Class94(true, this, local1, "runescape", 16);
			} catch (@Pc(57) Exception local57) {
				this.method3177("nocache");
				return;
			}
			@Pc(68) ClassLoader_Sub1 local68 = new ClassLoader_Sub1();
			@Pc(85) byte[] local85;
			try {
				Class.forName("java.util.jar.Pack200");
				local85 = this.method3178("runescape_1713272294.pack200", new File(this.aClass94_1.aFile5, "main_file_cache.dat0"), local26, 278643);
				if (local85 == null) {
					return;
				}
				local68.aClass91_1 = new Class91_Sub1(local85);
			} catch (@Pc(97) Throwable local97) {
			}
			@Pc(126) Class local126;
			if (local68.aClass91_1 == null) {
				local85 = this.method3178("unpackclass_-163111980.jar", new File(this.aClass94_1.aFile5, "game_unpacker.dat"), local28, 19185);
				if (local85 == null) {
					return;
				}
				local68.aClass91_1 = new Class91(local85);
				local126 = Class.forName("Class91");
				local68.aHashtable3.put(local126.getName(), local126);
				@Pc(137) Class local137 = local68.loadClass("unpackclass");
				local68 = new ClassLoader_Sub1();
				local85 = this.method3178("runescape_443776249.js5", new File(this.aClass94_1.aFile5, "main_file_cache.dat1"), local26, 286655);
				if (local85 == null) {
					return;
				}
				local68.aClass91_1 = (Class91) local137.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local85, Boolean.TRUE);
			}
			local126 = Class.forName("Class92");
			local68.aHashtable3.put(local126.getName(), local126);
			@Pc(199) Class local199 = Class.forName("Class94");
			local68.aHashtable3.put(local199.getName(), local199);
			local126 = Class.forName("Class93");
			local68.aHashtable3.put(local126.getName(), local126);
			local126 = Class.forName("Interface4");
			local68.aHashtable3.put(local126.getName(), local126);
			local126 = local68.loadClass("client");
			synchronized (this) {
				if (this.aBoolean221) {
					return;
				}
				this.anApplet2 = (Applet) local126.getDeclaredConstructor().newInstance();
				local126.getMethod("providesignlink", local199).invoke(null, this.aClass94_1);
				this.anApplet2.init();
				if (this.aBoolean222) {
					this.anApplet2.start();
				}
				if (this.aBoolean223) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(290) Exception local290) {
			RuntimeException_Sub2.anInt4382 = 443776249;
			if (local290 instanceof InvocationTargetException) {
				@Pc(306) Throwable local306 = ((InvocationTargetException) local290).getTargetException();
				if (local306 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method3167(this, local306, local290.toString());
			} else {
				RuntimeException_Sub2.method3167(this, local290, null);
			}
			this.method3177("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean221 = true;
		this.aBoolean222 = this.aBoolean223 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;II)[B")
	private byte[] method3178(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		@Pc(4) byte[] local4 = this.method3176(arg1);
		if (!this.method3175(local4, arg0)) {
			local4 = this.method3179(arg0, arg2, arg3, false);
			if (local4 == null) {
				local4 = this.method3179(arg0, arg2, arg3, true);
			}
			if (local4 == null) {
				this.method3177("download");
				return null;
			}
			if (!this.method3180(arg1, local4)) {
				return null;
			}
			local4 = this.method3176(arg1);
			if (!this.method3175(local4, arg0)) {
				this.method3177("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;IZ)[B")
	private byte[] method3179(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(15) byte[] local15 = new byte[arg2];
		@Pc(20) Color local20 = new Color(9179409);
		try {
			@Pc(61) InputStream local61;
			if (arg3) {
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
				@Pc(91) int local91 = local15.length - local81;
				if (local91 > 1000) {
					local91 = 1000;
				}
				@Pc(102) int local102 = local61.read(local15, local81, local91);
				if (local102 < 0) {
					throw new EOFException();
				}
				local81 += local102;
				@Pc(120) int local120 = local81 * 100 / local15.length;
				if (local120 != local73) {
					try {
						@Pc(127) Graphics local127 = this.getGraphics();
						if (local127 == null) {
							this.repaint();
						} else {
							local127.setColor(Color.black);
							@Pc(146) String local146 = arg1 + " - " + local120 + "%";
							local73 = local120;
							local127.fillRect(0, 0, this.anInt4384, this.anInt4385);
							local127.setColor(local20);
							local127.drawRect(this.anInt4384 / 2 - 152, this.anInt4385 / 2 - 18, 303, 33);
							local127.setFont(local8);
							local127.setColor(Color.white);
							local127.drawString(local146, (this.anInt4384 - local12.stringWidth(local146)) / 2, this.anInt4385 / 2 + 4);
						}
					} catch (@Pc(205) Exception local205) {
					}
				}
			}
			local61.close();
		} catch (@Pc(211) IOException local211) {
			return null;
		}
		return this.method3175(local15, arg0) ? local15 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean222 = false;
		this.aBoolean223 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	private boolean method3180(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method3177("savefile");
			return false;
		}
	}
}
