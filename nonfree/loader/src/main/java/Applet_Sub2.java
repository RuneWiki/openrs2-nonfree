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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Lloader!ke;")
	private Class94 aClass94_1;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt4084;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt4085;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean179;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean178;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean180;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean181;

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean180 = false;
		this.aBoolean179 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;ILjava/lang/String;I)[B")
	private byte[] method3066(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		@Pc(4) byte[] local4 = this.method3070(arg0);
		if (!this.method3069(arg3, local4)) {
			local4 = this.method3067(arg1, arg3, arg2, false);
			if (local4 == null) {
				local4 = this.method3067(arg1, arg3, arg2, true);
			}
			if (local4 == null) {
				this.method3068("download");
				return null;
			}
			if (!this.method3071(arg0, local4)) {
				return null;
			}
			local4 = this.method3070(arg0);
			if (!this.method3069(arg3, local4)) {
				this.method3068("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean181 = true;
		this.aBoolean180 = this.aBoolean179 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZI)[B")
	private byte[] method3067(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(18) FontMetrics local18 = this.getFontMetrics(local8);
		@Pc(23) Color local23 = new Color(9179409);
		@Pc(26) byte[] local26 = new byte[arg2];
		try {
			@Pc(36) InputStream local36;
			if (arg3) {
				@Pc(41) URL local41 = this.getCodeBase();
				@Pc(49) Socket local49 = new Socket(InetAddress.getByName(local41.getHost()), 443);
				local49.setSoTimeout(10000);
				@Pc(55) OutputStream local55 = local49.getOutputStream();
				local55.write(17);
				local55.write(("JAGGRAB " + local41.getFile() + arg1 + "\n\n").getBytes());
				local36 = local49.getInputStream();
			} else {
				local36 = (new URL(this.getCodeBase(), arg1)).openStream();
			}
			@Pc(79) int local79 = -1;
			@Pc(81) int local81 = 0;
			while (local81 < local26.length) {
				@Pc(95) int local95 = local26.length - local81;
				if (local95 > 1000) {
					local95 = 1000;
				}
				@Pc(107) int local107 = local36.read(local26, local81, local95);
				if (local107 < 0) {
					throw new EOFException();
				}
				local81 += local107;
				@Pc(125) int local125 = local81 * 100 / local26.length;
				if (local79 != local125) {
					try {
						@Pc(132) Graphics local132 = this.getGraphics();
						if (local132 == null) {
							this.repaint();
						} else {
							local132.setColor(Color.black);
							local79 = local125;
							@Pc(153) String local153 = arg0 + " - " + local125 + "%";
							local132.fillRect(0, 0, this.anInt4085, this.anInt4084);
							local132.setColor(local23);
							local132.drawRect(this.anInt4085 / 2 - 152, this.anInt4084 / 2 + -18, 303, 33);
							local132.setFont(local8);
							local132.setColor(Color.white);
							local132.drawString(local153, (this.anInt4085 - local18.stringWidth(local153)) / 2, this.anInt4084 / 2 + 4);
						}
					} catch (@Pc(209) Exception local209) {
					}
				}
			}
			local36.close();
		} catch (@Pc(215) IOException local215) {
			return null;
		}
		return this.method3069(arg1, local26) ? local26 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt4085 = Integer.parseInt(this.getParameter("width"));
			this.anInt4084 = Integer.parseInt(this.getParameter("height"));
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
			} catch (@Pc(46) Exception local46) {
			}
			try {
				this.aClass94_1 = new Class94(true, this, local13, "runescape", 16);
			} catch (@Pc(58) Exception local58) {
				this.method3068("nocache");
				return;
			}
			@Pc(69) ClassLoader_Sub1 local69 = new ClassLoader_Sub1();
			@Pc(86) byte[] local86;
			try {
				Class.forName("java.util.jar.Pack200");
				local86 = this.method3066(new File(this.aClass94_1.aFile5, "main_file_cache.dat0"), local26, 283634, "runescape_1640439883.pack200");
				if (local86 == null) {
					return;
				}
				local69.aClass92_1 = new Class92_Sub1(local86);
			} catch (@Pc(99) Throwable local99) {
			}
			@Pc(130) Class local130;
			if (local69.aClass92_1 == null) {
				local86 = this.method3066(new File(this.aClass94_1.aFile5, "game_unpacker.dat"), local28, 19185, "unpackclass_-163111980.jar");
				if (local86 == null) {
					return;
				}
				local69.aClass92_1 = new Class92(local86);
				local130 = Class.forName("Class92");
				local69.aHashtable3.put(local130.getName(), local130);
				@Pc(141) Class local141 = local69.loadClass("unpackclass");
				local69 = new ClassLoader_Sub1();
				local86 = this.method3066(new File(this.aClass94_1.aFile5, "main_file_cache.dat1"), local26, 290695, "runescape_-1483919650.js5");
				if (local86 == null) {
					return;
				}
				local69.aClass92_1 = (Class92) local141.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local86, Boolean.TRUE);
			}
			local130 = Class.forName("Class95");
			local69.aHashtable3.put(local130.getName(), local130);
			@Pc(203) Class local203 = Class.forName("Class94");
			local69.aHashtable3.put(local203.getName(), local203);
			local130 = Class.forName("Class93");
			local69.aHashtable3.put(local130.getName(), local130);
			local130 = Class.forName("Interface4");
			local69.aHashtable3.put(local130.getName(), local130);
			local130 = local69.loadClass("client");
			synchronized (this) {
				if (this.aBoolean181) {
					return;
				}
				this.anApplet3 = (Applet) local130.getDeclaredConstructor().newInstance();
				local130.getMethod("providesignlink", local203).invoke(null, this.aClass94_1);
				this.anApplet3.init();
				if (this.aBoolean180) {
					this.anApplet3.start();
				}
				if (this.aBoolean179) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(295) Exception local295) {
			RuntimeException_Sub2.anInt4078 = -1483919650;
			if (local295 instanceof InvocationTargetException) {
				@Pc(304) Throwable local304 = ((InvocationTargetException) local295).getTargetException();
				if (local304 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method3046(this, local295.toString(), local304);
			} else {
				RuntimeException_Sub2.method3046(this, null, local295);
			}
			this.method3068("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method3068(@OriginalArg(1) String arg0) {
		if (this.aBoolean178) {
			return;
		}
		this.aBoolean178 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(31) Exception local31) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I[B)Z")
	private boolean method3069(@OriginalArg(0) String arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(6) MessageDigest local6 = MessageDigest.getInstance("SHA");
			local6.reset();
			local6.update(arg1);
			@Pc(14) byte[] local14 = local6.digest();
			if (arg0 == "runescape_1640439883.pack200") {
				if (local14[0] != -19 || local14[1] != -104 || local14[2] != 42 || local14[3] != -42 || local14[4] != -70 || local14[5] != 83 || local14[6] != 113 || local14[7] != -80 || local14[8] != 51 || local14[9] != -61 || local14[10] != -56 || local14[11] != -48 || local14[12] != 19 || local14[13] != 101 || local14[14] != 42 || local14[15] != 92 || local14[16] != 0 || local14[17] != 113 || local14[18] != -115 || local14[19] != 34) {
					return false;
				}
			} else if (arg0 == "runescape_-1483919650.js5") {
				if (local14[0] != -115 || local14[1] != 90 || local14[2] != 26 || local14[3] != -59 || local14[4] != -42 || local14[5] != 95 || local14[6] != 80 || local14[7] != -80 || local14[8] != 45 || local14[9] != -119 || local14[10] != 41 || local14[11] != -3 || local14[12] != 55 || local14[13] != 78 || local14[14] != -13 || local14[15] != 84 || local14[16] != -127 || local14[17] != -83 || local14[18] != 98 || local14[19] != 77) {
					return false;
				}
			} else if (local14[0] != 23 || local14[1] != 83 || local14[2] != 57 || local14[3] != 35 || local14[4] != 83 || local14[5] != -48 || local14[6] != 29 || local14[7] != -121 || local14[8] != 101 || local14[9] != 45 || local14[10] != -13 || local14[11] != -62 || local14[12] != -10 || local14[13] != 46 || local14[14] != -57 || local14[15] != -48 || local14[16] != 115 || local14[17] != 102 || local14[18] != 94 || local14[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(390) Exception local390) {
			this.method3068("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method3070(@OriginalArg(1) File arg0) {
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
		} catch (@Pc(38) IOException local38) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;[BB)Z")
	private boolean method3071(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg0);
			local9.write(arg1, 0, arg1.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method3068("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean181 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean180 = true;
		this.aBoolean179 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}
}
