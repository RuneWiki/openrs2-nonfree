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

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Lloader!od;")
	private Class92 aClass92_1;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt4794;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt4795;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean214;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean217;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean216;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean215;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I[B)Z")
	private boolean method3234(@OriginalArg(0) String arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(7) MessageDigest local7 = MessageDigest.getInstance("SHA");
			local7.reset();
			local7.update(arg1);
			@Pc(23) byte[] local23 = local7.digest();
			if (arg0 == "runescape_455177102.pack200") {
				if (local23[0] != 19 || local23[1] != 3 || local23[2] != -128 || local23[3] != 58 || local23[4] != -12 || local23[5] != 14 || local23[6] != -5 || local23[7] != -44 || local23[8] != 15 || local23[9] != -32 || local23[10] != -3 || local23[11] != 118 || local23[12] != 73 || local23[13] != 2 || local23[14] != -83 || local23[15] != -40 || local23[16] != 27 || local23[17] != 119 || local23[18] != 104 || local23[19] != -66) {
					return false;
				}
			} else if (arg0 == "runescape_-136638787.js5") {
				if (local23[0] != 101 || local23[1] != -105 || local23[2] != 9 || local23[3] != -62 || local23[4] != -62 || local23[5] != -4 || local23[6] != -126 || local23[7] != -10 || local23[8] != -10 || local23[9] != 37 || local23[10] != -74 || local23[11] != 42 || local23[12] != 27 || local23[13] != -99 || local23[14] != -77 || local23[15] != 127 || local23[16] != 6 || local23[17] != 90 || local23[18] != 125 || local23[19] != -72) {
					return false;
				}
			} else if (local23[0] != 23 || local23[1] != 83 || local23[2] != 57 || local23[3] != 35 || local23[4] != 83 || local23[5] != -48 || local23[6] != 29 || local23[7] != -121 || local23[8] != 101 || local23[9] != 45 || local23[10] != -13 || local23[11] != -62 || local23[12] != -10 || local23[13] != 46 || local23[14] != -57 || local23[15] != -48 || local23[16] != 115 || local23[17] != 102 || local23[18] != 94 || local23[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(401) Exception local401) {
			this.method3238("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean215 = false;
		this.aBoolean214 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/io/File;I)[B")
	private byte[] method3235(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) File arg3) {
		@Pc(4) byte[] local4 = this.method3236(arg3);
		if (!this.method3234(arg0, local4)) {
			local4 = this.method3237(false, arg0, arg1, arg2);
			if (local4 == null) {
				local4 = this.method3237(true, arg0, arg1, arg2);
			}
			if (local4 == null) {
				this.method3238("download");
				return null;
			}
			if (!this.method3239(local4, arg3)) {
				return null;
			}
			local4 = this.method3236(arg3);
			if (!this.method3234(arg0, local4)) {
				this.method3238("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method3236(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(17) int local17 = (int) arg0.length();
			@Pc(28) DataInputStream local28 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(31) byte[] local31 = new byte[local17];
			local28.readFully(local31, 0, local17);
			local28.close();
			return local31;
		} catch (@Pc(41) IOException local41) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean216 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;I)[B")
	private byte[] method3237(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(4) byte[] local4 = new byte[arg3];
		@Pc(11) Font local11 = new Font("Helvetica", 1, 13);
		@Pc(15) FontMetrics local15 = this.getFontMetrics(local11);
		@Pc(20) Color local20 = new Color(9179409);
		try {
			@Pc(30) InputStream local30;
			if (arg0) {
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
			while (local81 < local4.length) {
				@Pc(91) int local91 = local4.length - local81;
				if (local91 > 1000) {
					local91 = 1000;
				}
				@Pc(104) int local104 = local30.read(local4, local81, local91);
				if (local104 < 0) {
					throw new EOFException();
				}
				local81 += local104;
				@Pc(123) int local123 = local81 * 100 / local4.length;
				if (local123 != local79) {
					try {
						@Pc(134) Graphics local134 = this.getGraphics();
						if (local134 == null) {
							this.repaint();
						} else {
							local79 = local123;
							@Pc(151) String local151 = arg2 + " - " + local123 + "%";
							local134.setColor(Color.black);
							local134.fillRect(0, 0, this.anInt4794, this.anInt4795);
							local134.setColor(local20);
							local134.drawRect(this.anInt4794 / 2 - 152, this.anInt4795 / 2 + -18, 303, 33);
							local134.setFont(local11);
							local134.setColor(Color.white);
							local134.drawString(local151, (this.anInt4794 - local15.stringWidth(local151)) / 2, this.anInt4795 / 2 + 4);
						}
					} catch (@Pc(211) Exception local211) {
					}
				}
			}
			local30.close();
		} catch (@Pc(217) IOException local217) {
			return null;
		}
		return this.method3234(arg1, local4) ? local4 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private void method3238(@OriginalArg(0) String arg0) {
		if (this.aBoolean217) {
			return;
		}
		this.aBoolean217 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(1) int local1 = 32;
			this.anInt4794 = Integer.parseInt(this.getParameter("width"));
			this.anInt4795 = Integer.parseInt(this.getParameter("height"));
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
				this.method3238("nocache");
				return;
			}
			@Pc(68) ClassLoader_Sub1 local68 = new ClassLoader_Sub1();
			@Pc(85) byte[] local85;
			try {
				Class.forName("java.util.jar.Pack200");
				local85 = this.method3235("runescape_455177102.pack200", local28, 275897, new File(this.aClass92_1.aFile4, "main_file_cache.dat0"));
				if (local85 == null) {
					return;
				}
				local68.aClass90_1 = new Class90_Sub1(local85);
			} catch (@Pc(97) Throwable local97) {
			}
			@Pc(130) Class local130;
			if (local68.aClass90_1 == null) {
				local85 = this.method3235("unpackclass_-163111980.jar", local26, 19185, new File(this.aClass92_1.aFile4, "game_unpacker.dat"));
				if (local85 == null) {
					return;
				}
				local68.aClass90_1 = new Class90(local85);
				local130 = Class.forName("Class90");
				local68.aHashtable1.put(local130.getName(), local130);
				@Pc(141) Class local141 = local68.loadClass("unpackclass");
				local68 = new ClassLoader_Sub1();
				local85 = this.method3235("runescape_-136638787.js5", local28, 283946, new File(this.aClass92_1.aFile4, "main_file_cache.dat1"));
				if (local85 == null) {
					return;
				}
				local68.aClass90_1 = (Class90) local141.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local85, Boolean.TRUE);
			}
			local130 = Class.forName("Class93");
			local68.aHashtable1.put(local130.getName(), local130);
			@Pc(203) Class local203 = Class.forName("Class92");
			local68.aHashtable1.put(local203.getName(), local203);
			local130 = Class.forName("Class91");
			local68.aHashtable1.put(local130.getName(), local130);
			local130 = Class.forName("Interface4");
			local68.aHashtable1.put(local130.getName(), local130);
			local130 = local68.loadClass("client");
			synchronized (this) {
				if (this.aBoolean216) {
					return;
				}
				this.anApplet2 = (Applet) local130.getDeclaredConstructor().newInstance();
				local130.getMethod("providesignlink", local203).invoke(null, this.aClass92_1);
				this.anApplet2.init();
				if (this.aBoolean214) {
					this.anApplet2.start();
				}
				if (this.aBoolean215) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(295) Exception local295) {
			RuntimeException_Sub2.anInt4790 = -136638787;
			if (local295 instanceof InvocationTargetException) {
				@Pc(304) Throwable local304 = ((InvocationTargetException) local295).getTargetException();
				if (local304 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method3223(local295.toString(), this, local304);
			} else {
				RuntimeException_Sub2.method3223(null, this, local295);
			}
			this.method3238("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean214 = false;
		this.aBoolean215 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean214 = this.aBoolean215 = false;
		this.aBoolean216 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B[BLjava/io/File;)Z")
	private boolean method3239(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method3238("savefile");
			return false;
		}
	}
}
