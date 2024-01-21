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
	private int anInt4314;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt4315;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean199;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean201;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean200;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean202;

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean200 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt4314 = Integer.parseInt(this.getParameter("width"));
			this.anInt4315 = Integer.parseInt(this.getParameter("height"));
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
			} catch (@Pc(45) Exception local45) {
			}
			@Pc(54) Class107 local54;
			try {
				local54 = new Class107(true, this, local13, "runescape", 24);
			} catch (@Pc(56) Exception local56) {
				this.method3296("nocache");
				return;
			}
			@Pc(65) ClassLoader_Sub1 local65 = new ClassLoader_Sub1();
			try {
				Class.forName("java.util.jar.Pack200");
				@Pc(70) String local70 = "main_file_cache.dat0";
				@Pc(83) byte[] local83 = this.method3300(322242, "runescape_457233739.pack200", new File(local54.aFile4, local70), local26);
				if (local83 == null) {
					return;
				}
				local65.aClass108_1 = new Class108_Sub1(local83);
			} catch (@Pc(96) Throwable local96) {
			}
			if (local65.aClass108_1 == null) {
				@Pc(113) byte[] local113 = this.method3300(19590, "unpackclass_-462058432.pack", new File(local54.aFile4, "game_unpacker.dat"), local28);
				if (local113 == null) {
					return;
				}
				@Pc(120) ClassLoader_Sub1 local120 = new ClassLoader_Sub1();
				local120.aClass108_1 = new Class108(local113);
				@Pc(128) String local128 = "main_file_cache.dat1";
				@Pc(131) Class local131 = Class.forName("Class108");
				local120.aHashtable3.put(local131.getName(), local131);
				@Pc(142) Class local142 = local120.loadClass("unpackclass");
				local113 = this.method3300(326495, "runescape_-1317565765.js5", new File(local54.aFile4, local128), local26);
				if (local113 == null) {
					return;
				}
				local65.aClass108_1 = (Class108) local142.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local113, Boolean.TRUE);
			}
			@Pc(189) Class local189 = Class.forName("Class110");
			local65.aHashtable3.put(local189.getName(), local189);
			@Pc(199) Class local199 = Class.forName("Class107");
			local65.aHashtable3.put(local199.getName(), local199);
			@Pc(209) Class local209 = Class.forName("Class109");
			local65.aHashtable3.put(local209.getName(), local209);
			@Pc(219) Class local219 = Class.forName("Interface4");
			local65.aHashtable3.put(local219.getName(), local219);
			@Pc(230) Class local230 = local65.loadClass("client");
			synchronized (this) {
				if (this.aBoolean200) {
					return;
				}
				this.anApplet3 = (Applet) local230.getDeclaredConstructor().newInstance();
				local230.getMethod("providesignlink", local199).invoke(null, local54);
				this.anApplet3.init();
				if (this.aBoolean199) {
					this.anApplet3.start();
				}
				if (this.aBoolean201) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(290) Exception local290) {
			RuntimeException_Sub2.anInt4309 = -1317565765;
			if (local290 instanceof InvocationTargetException) {
				@Pc(299) Throwable local299 = ((InvocationTargetException) local290).getTargetException();
				if (local299 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method3285(local290.toString(), this, local299);
			} else {
				RuntimeException_Sub2.method3285(null, this, local290);
			}
			this.method3296("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method3296(@OriginalArg(0) String arg0) {
		if (this.aBoolean202) {
			return;
		}
		this.aBoolean202 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(30) Exception local30) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean201 = false;
		this.aBoolean199 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;[B)Z")
	private boolean method3297(@OriginalArg(1) String arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(7) MessageDigest local7 = MessageDigest.getInstance("SHA");
			local7.reset();
			local7.update(arg1);
			@Pc(20) byte[] local20 = local7.digest();
			if (arg0 == "runescape_457233739.pack200") {
				if (local20[0] != 53 || local20[1] != 103 || local20[2] != 102 || local20[3] != -76 || local20[4] != -114 || local20[5] != 45 || local20[6] != -64 || local20[7] != 2 || local20[8] != -104 || local20[9] != 122 || local20[10] != -100 || local20[11] != -125 || local20[12] != -123 || local20[13] != 104 || local20[14] != 3 || local20[15] != 124 || local20[16] != 81 || local20[17] != -101 || local20[18] != 71 || local20[19] != 68) {
					return false;
				}
			} else if (arg0 == "runescape_-1317565765.js5") {
				if (local20[0] != -30 || local20[1] != -98 || local20[2] != -123 || local20[3] != -122 || local20[4] != -24 || local20[5] != -49 || local20[6] != 77 || local20[7] != -76 || local20[8] != -60 || local20[9] != -11 || local20[10] != 100 || local20[11] != 118 || local20[12] != -69 || local20[13] != -56 || local20[14] != 69 || local20[15] != -79 || local20[16] != 0 || local20[17] != -92 || local20[18] != 48 || local20[19] != 89) {
					return false;
				}
			} else if (arg0 == "unpackclass_-462058432.pack") {
				if (local20[0] != 88 || local20[1] != 0 || local20[2] != -7 || local20[3] != -109 || local20[4] != 43 || local20[5] != -100 || local20[6] != -104 || local20[7] != 7 || local20[8] != -25 || local20[9] != 69 || local20[10] != 28 || local20[11] != 18 || local20[12] != 106 || local20[13] != 112 || local20[14] != 33 || local20[15] != 50 || local20[16] != 123 || local20[17] != -108 || local20[18] != -80 || local20[19] != 35) {
					return false;
				}
			} else if (arg0 == "jogl_181740960.pack") {
				if (local20[0] != 74 || local20[1] != 7 || local20[2] != -54 || local20[3] != 86 || local20[4] != 3 || local20[5] != 113 || local20[6] != -45 || local20[7] != -123 || local20[8] != 63 || local20[9] != 97 || local20[10] != 69 || local20[11] != -41 || local20[12] != -121 || local20[13] != 126 || local20[14] != -30 || local20[15] != -32 || local20[16] != 33 || local20[17] != -122 || local20[18] != -111 || local20[19] != 63) {
					return false;
				}
			} else if (arg0 == "jogl_-1134983286.dll") {
				if (local20[0] != 43 || local20[1] != 73 || local20[2] != -119 || local20[3] != -99 || local20[4] != -19 || local20[5] != 109 || local20[6] != -62 || local20[7] != 40 || local20[8] != 41 || local20[9] != -91 || local20[10] != -88 || local20[11] != -50 || local20[12] != -38 || local20[13] != -127 || local20[14] != -126 || local20[15] != 33 || local20[16] != -93 || local20[17] != -95 || local20[18] != -123 || local20[19] != 66) {
					return false;
				}
			} else if (arg0 == "jogl_awt_-532687481.dll" && (local20[0] != -26 || local20[1] != 91 || local20[2] != -12 || local20[3] != -87 || local20[4] != 122 || local20[5] != -5 || local20[6] != 108 || local20[7] != 94 || local20[8] != 20 || local20[9] != 111 || local20[10] != 116 || local20[11] != -56 || local20[12] != -10 || local20[13] != 66 || local20[14] != -92 || local20[15] != -125 || local20[16] != -41 || local20[17] != 70 || local20[18] != 81 || local20[19] != -71)) {
				return false;
			}
			return true;
		} catch (@Pc(771) Exception local771) {
			this.method3296("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean199 = false;
		this.aBoolean201 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;B)[B")
	private byte[] method3298(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(20) byte[] local20 = new byte[arg1];
		try {
			@Pc(30) InputStream local30;
			if (arg0) {
				@Pc(35) URL local35 = this.getCodeBase();
				@Pc(43) Socket local43 = new Socket(InetAddress.getByName(local35.getHost()), 443);
				local43.setSoTimeout(10000);
				@Pc(49) OutputStream local49 = local43.getOutputStream();
				local49.write(17);
				local49.write(("JAGGRAB " + local35.getFile() + arg2 + "\n\n").getBytes());
				local30 = local43.getInputStream();
			} else {
				local30 = (new URL(this.getCodeBase(), arg2)).openStream();
			}
			@Pc(78) int local78 = -1;
			@Pc(80) int local80 = 0;
			while (local20.length > local80) {
				@Pc(90) int local90 = local20.length - local80;
				if (local90 > 1000) {
					local90 = 1000;
				}
				@Pc(102) int local102 = local30.read(local20, local80, local90);
				if (local102 < 0) {
					throw new EOFException();
				}
				local80 += local102;
				@Pc(122) int local122 = local80 * 100 / local20.length;
				if (local122 != local78) {
					try {
						@Pc(132) Graphics local132 = this.getGraphics();
						if (local132 == null) {
							this.repaint();
						} else {
							local78 = local122;
							@Pc(153) String local153 = arg3 + " - " + local122 + "%";
							local132.setColor(Color.black);
							local132.fillRect(0, 0, this.anInt4314, this.anInt4315);
							local132.setColor(local17);
							local132.drawRect(this.anInt4314 / 2 - 152, this.anInt4315 / 2 - 18, 303, 33);
							local132.setFont(local8);
							local132.setColor(Color.white);
							local132.drawString(local153, (this.anInt4314 - local12.stringWidth(local153)) / 2, this.anInt4315 / 2 + 4);
						}
					} catch (@Pc(208) Exception local208) {
					}
				}
			}
			local30.close();
		} catch (@Pc(214) IOException local214) {
			return null;
		}
		return this.method3297(arg2, local20) ? local20 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;Z)[B")
	private byte[] method3299(@OriginalArg(0) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean200 = true;
		this.aBoolean199 = this.aBoolean201 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;Ljava/io/File;Ljava/lang/String;B)[B")
	private byte[] method3300(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) File arg2, @OriginalArg(3) String arg3) {
		@Pc(4) byte[] local4 = this.method3299(arg2);
		if (!this.method3297(arg1, local4)) {
			local4 = this.method3298(false, arg0, arg1, arg3);
			if (local4 == null) {
				local4 = this.method3298(true, arg0, arg1, arg3);
			}
			if (local4 == null) {
				this.method3296("download");
				return null;
			}
			if (!this.method3301(local4, arg2)) {
				return null;
			}
			local4 = this.method3299(arg2);
			if (!this.method3297(arg1, local4)) {
				this.method3296("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/io/File;)Z")
	private boolean method3301(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method3296("savefile");
			return false;
		}
	}
}
