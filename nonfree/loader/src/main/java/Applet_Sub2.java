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
	private int anInt4156;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt4157;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Lloader!pf;")
	private Class96 aClass96_1;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean176;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean175;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean177;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean178;

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;BLjava/io/File;)[B")
	private byte[] method3167(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(4) File arg3) {
		@Pc(4) byte[] local4 = this.method3172(arg3);
		if (!this.method3171(local4, arg2)) {
			local4 = this.method3168(arg2, false, arg0, arg1);
			if (local4 == null) {
				local4 = this.method3168(arg2, true, arg0, arg1);
			}
			if (local4 == null) {
				this.method3169("download");
				return null;
			}
			if (!this.method3170(arg3, local4)) {
				return null;
			}
			local4 = this.method3172(arg3);
			if (!this.method3171(local4, arg2)) {
				this.method3169("mismatch");
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
			this.anInt4156 = Integer.parseInt(this.getParameter("width"));
			this.anInt4157 = Integer.parseInt(this.getParameter("height"));
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
			} catch (@Pc(46) Exception local46) {
			}
			try {
				this.aClass96_1 = new Class96(true, this, local1, "runescape", 16);
			} catch (@Pc(58) Exception local58) {
				this.method3169("nocache");
				return;
			}
			@Pc(69) ClassLoader_Sub1 local69 = new ClassLoader_Sub1();
			@Pc(86) byte[] local86;
			try {
				Class.forName("java.util.jar.Pack200");
				local86 = this.method3167(280135, local28, "runescape_1014281354.pack200", new File(this.aClass96_1.aFile6, "main_file_cache.dat0"));
				if (local86 == null) {
					return;
				}
				local69.aClass93_1 = new Class93_Sub1(local86);
			} catch (@Pc(99) Throwable local99) {
			}
			@Pc(130) Class local130;
			if (local69.aClass93_1 == null) {
				local86 = this.method3167(19185, local26, "unpackclass_-163111980.jar", new File(this.aClass96_1.aFile6, "game_unpacker.dat"));
				if (local86 == null) {
					return;
				}
				local69.aClass93_1 = new Class93(local86);
				local130 = Class.forName("Class93");
				local69.aHashtable1.put(local130.getName(), local130);
				@Pc(141) Class local141 = local69.loadClass("unpackclass");
				local69 = new ClassLoader_Sub1();
				local86 = this.method3167(290310, local28, "runescape_-1422641286.js5", new File(this.aClass96_1.aFile6, "main_file_cache.dat1"));
				if (local86 == null) {
					return;
				}
				local69.aClass93_1 = (Class93) local141.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local86, Boolean.TRUE);
			}
			local130 = Class.forName("Class95");
			local69.aHashtable1.put(local130.getName(), local130);
			@Pc(203) Class local203 = Class.forName("Class96");
			local69.aHashtable1.put(local203.getName(), local203);
			local130 = Class.forName("Class94");
			local69.aHashtable1.put(local130.getName(), local130);
			local130 = Class.forName("Interface4");
			local69.aHashtable1.put(local130.getName(), local130);
			local130 = local69.loadClass("client");
			synchronized (this) {
				if (this.aBoolean176) {
					return;
				}
				this.anApplet2 = (Applet) local130.getDeclaredConstructor().newInstance();
				local130.getMethod("providesignlink", local203).invoke(null, this.aClass96_1);
				this.anApplet2.init();
				if (this.aBoolean175) {
					this.anApplet2.start();
				}
				if (this.aBoolean178) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(295) Exception local295) {
			RuntimeException_Sub2.anInt4152 = -1422641286;
			if (local295 instanceof InvocationTargetException) {
				@Pc(311) Throwable local311 = ((InvocationTargetException) local295).getTargetException();
				if (local311 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method3160(local311, this, local295.toString());
			} else {
				RuntimeException_Sub2.method3160(local295, this, null);
			}
			this.method3169("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean176 = true;
		this.aBoolean175 = this.aBoolean178 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;ZBILjava/lang/String;)[B")
	private byte[] method3168(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(19) FontMetrics local19 = this.getFontMetrics(local8);
		@Pc(24) Color local24 = new Color(9179409);
		@Pc(27) byte[] local27 = new byte[arg2];
		try {
			@Pc(68) InputStream local68;
			if (arg1) {
				@Pc(32) URL local32 = this.getCodeBase();
				@Pc(40) Socket local40 = new Socket(InetAddress.getByName(local32.getHost()), 443);
				local40.setSoTimeout(10000);
				@Pc(46) OutputStream local46 = local40.getOutputStream();
				local46.write(17);
				local46.write(("JAGGRAB " + local32.getFile() + arg0 + "\n\n").getBytes());
				local68 = local40.getInputStream();
			} else {
				local68 = (new URL(this.getCodeBase(), arg0)).openStream();
			}
			@Pc(80) int local80 = -1;
			@Pc(82) int local82 = 0;
			while (local27.length > local82) {
				@Pc(96) int local96 = local27.length - local82;
				if (local96 > 1000) {
					local96 = 1000;
				}
				@Pc(109) int local109 = local68.read(local27, local82, local96);
				if (local109 < 0) {
					throw new EOFException();
				}
				local82 += local109;
				@Pc(128) int local128 = local82 * 100 / local27.length;
				if (local128 != local80) {
					try {
						@Pc(135) Graphics local135 = this.getGraphics();
						if (local135 == null) {
							this.repaint();
						} else {
							local80 = local128;
							local135.setColor(Color.black);
							local135.fillRect(0, 0, this.anInt4156, this.anInt4157);
							@Pc(164) String local164 = arg3 + " - " + local128 + "%";
							local135.setColor(local24);
							local135.drawRect(this.anInt4156 / 2 - 152, this.anInt4157 / 2 - 18, 303, 33);
							local135.setFont(local8);
							local135.setColor(Color.white);
							local135.drawString(local164, (this.anInt4156 - local19.stringWidth(local164)) / 2, this.anInt4157 / 2 + 4);
						}
					} catch (@Pc(212) Exception local212) {
					}
				}
			}
			local68.close();
		} catch (@Pc(218) IOException local218) {
			return null;
		}
		return this.method3171(local27, arg0) ? local27 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean176 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method3169(@OriginalArg(1) String arg0) {
		if (this.aBoolean177) {
			return;
		}
		this.aBoolean177 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(30) Exception local30) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	private boolean method3170(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(24) IOException local24) {
			this.method3169("savefile");
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

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean175 = false;
		this.aBoolean178 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/lang/String;B)Z")
	private boolean method3171(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(14) MessageDigest local14 = MessageDigest.getInstance("SHA");
			local14.reset();
			local14.update(arg0);
			@Pc(22) byte[] local22 = local14.digest();
			if (arg1 == "runescape_1014281354.pack200") {
				if (local22[0] != -126 || local22[1] != -35 || local22[2] != 48 || local22[3] != -105 || local22[4] != -15 || local22[5] != -9 || local22[6] != 83 || local22[7] != 37 || local22[8] != 66 || local22[9] != 7 || local22[10] != 53 || local22[11] != -96 || local22[12] != 43 || local22[13] != 106 || local22[14] != 88 || local22[15] != -63 || local22[16] != -62 || local22[17] != -106 || local22[18] != 49 || local22[19] != 83) {
					return false;
				}
			} else if (arg1 == "runescape_-1422641286.js5") {
				if (local22[0] != 84 || local22[1] != 103 || local22[2] != 105 || local22[3] != -8 || local22[4] != 31 || local22[5] != -80 || local22[6] != 77 || local22[7] != -11 || local22[8] != 50 || local22[9] != 7 || local22[10] != -45 || local22[11] != -38 || local22[12] != 54 || local22[13] != 118 || local22[14] != -76 || local22[15] != 81 || local22[16] != 64 || local22[17] != 114 || local22[18] != -48 || local22[19] != 64) {
					return false;
				}
			} else if (local22[0] != 23 || local22[1] != 83 || local22[2] != 57 || local22[3] != 35 || local22[4] != 83 || local22[5] != -48 || local22[6] != 29 || local22[7] != -121 || local22[8] != 101 || local22[9] != 45 || local22[10] != -13 || local22[11] != -62 || local22[12] != -10 || local22[13] != 46 || local22[14] != -57 || local22[15] != -48 || local22[16] != 115 || local22[17] != 102 || local22[18] != 94 || local22[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(410) Exception local410) {
			this.method3169("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;)[B")
	private byte[] method3172(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(15) int local15 = (int) arg0.length();
			@Pc(26) DataInputStream local26 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(29) byte[] local29 = new byte[local15];
			local26.readFully(local29, 0, local15);
			local26.close();
			return local29;
		} catch (@Pc(39) IOException local39) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean178 = false;
		this.aBoolean175 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}
}
