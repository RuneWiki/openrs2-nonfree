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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Lloader!de;")
	private Class84 aClass84_1;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt2911;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt2912;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean135;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;ZILjava/lang/String;)[B")
	private byte[] method1969(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) String arg3) {
		@Pc(16) Font local16 = new Font("Helvetica", 1, 13);
		@Pc(20) FontMetrics local20 = this.getFontMetrics(local16);
		@Pc(25) Color local25 = new Color(9179409);
		@Pc(28) byte[] local28 = new byte[arg0];
		try {
			@Pc(38) InputStream local38;
			if (arg2) {
				@Pc(43) URL local43 = this.getCodeBase();
				@Pc(51) Socket local51 = new Socket(InetAddress.getByName(local43.getHost()), 443);
				local51.setSoTimeout(10000);
				@Pc(57) OutputStream local57 = local51.getOutputStream();
				local57.write(17);
				local57.write(("JAGGRAB " + local43.getFile() + arg1 + "\n\n").getBytes());
				local38 = local51.getInputStream();
			} else {
				local38 = (new URL(this.getCodeBase(), arg1)).openStream();
			}
			@Pc(81) int local81 = -1;
			@Pc(83) int local83 = 0;
			while (local83 < local28.length) {
				@Pc(93) int local93 = local28.length - local83;
				if (local93 > 1000) {
					local93 = 1000;
				}
				@Pc(107) int local107 = local38.read(local28, local83, local93);
				if (local107 < 0) {
					throw new EOFException();
				}
				local83 += local107;
				@Pc(128) int local128 = local83 * 100 / local28.length;
				if (local81 != local128) {
					try {
						@Pc(138) Graphics local138 = this.getGraphics();
						if (local138 == null) {
							this.repaint();
						} else {
							local138.setColor(Color.black);
							@Pc(161) String local161 = arg3 + " - " + local128 + "%";
							local138.fillRect(0, 0, this.anInt2912, this.anInt2911);
							local138.setColor(local25);
							local138.drawRect(this.anInt2912 / 2 - 152, this.anInt2911 / 2 + -18, 303, 33);
							local138.setFont(local16);
							local81 = local128;
							local138.setColor(Color.white);
							local138.drawString(local161, (this.anInt2912 - local20.stringWidth(local161)) / 2, this.anInt2911 / 2 + 4);
						}
					} catch (@Pc(215) Exception local215) {
					}
				}
			}
			local38.close();
		} catch (@Pc(221) IOException local221) {
			return null;
		}
		return this.method1974(arg1, local28) ? local28 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BILjava/io/File;)Z")
	private boolean method1970(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			this.method1973("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/io/File;I)[B")
	private byte[] method1971(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) File arg2, @OriginalArg(4) int arg3) {
		@Pc(10) byte[] local10 = this.method1972(arg2);
		if (!this.method1974(arg0, local10)) {
			local10 = this.method1969(arg3, arg0, false, arg1);
			if (local10 == null) {
				local10 = this.method1969(arg3, arg0, true, arg1);
			}
			if (local10 == null) {
				this.method1973("download");
				return null;
			}
			if (!this.method1970(local10, arg2)) {
				return null;
			}
			local10 = this.method1972(arg2);
			if (!this.method1974(arg0, local10)) {
				this.method1973("mismatch");
				return null;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt2912 = Integer.parseInt(this.getParameter("width"));
			@Pc(7) int local7 = 32;
			this.anInt2911 = Integer.parseInt(this.getParameter("height"));
			try {
				@Pc(18) int local18 = Integer.parseInt(this.getParameter("modewhat"));
				local7 += local18;
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
				this.aClass84_1 = new Class84(true, this, local7, "runescape", 16);
			} catch (@Pc(57) Exception local57) {
				this.method1973("nocache");
				return;
			}
			@Pc(68) ClassLoader_Sub1 local68 = new ClassLoader_Sub1();
			@Pc(85) byte[] local85;
			try {
				Class.forName("java.util.jar.Pack200");
				local85 = this.method1971("runescape.pack200?crc=2095819194", local26, new File(this.aClass84_1.aFile6, "main_file_cache.dat0"), 239751);
				if (local85 == null) {
					return;
				}
				local68.aClass82_1 = new Class82_Sub1(local85);
			} catch (@Pc(97) Throwable local97) {
			}
			@Pc(128) Class local128;
			if (local68.aClass82_1 == null) {
				local85 = this.method1971("unpackclass.jar?crc=-549807395", local28, new File(this.aClass84_1.aFile6, "game_unpacker.dat"), 17836);
				if (local85 == null) {
					return;
				}
				local68.aClass82_1 = new Class82(local85);
				local128 = Class.forName("Class82");
				local68.aHashtable3.put(local128.getName(), local128);
				@Pc(139) Class local139 = local68.loadClass("unpackclass");
				local68 = new ClassLoader_Sub1();
				local85 = this.method1971("runescape.js5?crc=604678077", local26, new File(this.aClass84_1.aFile6, "main_file_cache.dat1"), 255612);
				if (local85 == null) {
					return;
				}
				local68.aClass82_1 = (Class82) local139.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local85, Boolean.TRUE);
			}
			local128 = Class.forName("Class83");
			local68.aHashtable3.put(local128.getName(), local128);
			@Pc(201) Class local201 = Class.forName("Class84");
			local68.aHashtable3.put(local201.getName(), local201);
			local128 = Class.forName("Class85");
			local68.aHashtable3.put(local128.getName(), local128);
			local128 = Class.forName("Interface4");
			local68.aHashtable3.put(local128.getName(), local128);
			local128 = local68.loadClass("client");
			this.anApplet3 = (Applet) local128.getDeclaredConstructor().newInstance();
			local128.getMethod("providesignlink", local201).invoke(null, this.aClass84_1);
			this.anApplet3.init();
			this.anApplet3.start();
		} catch (@Pc(264) Exception local264) {
			RuntimeException_Sub2.anInt2904 = 604678077;
			if (local264 instanceof InvocationTargetException) {
				@Pc(273) Throwable local273 = ((InvocationTargetException) local264).getTargetException();
				if (local273 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method1950(local264.toString(), this, local273);
			} else {
				RuntimeException_Sub2.method1950(null, this, local264);
			}
			this.method1973("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method1972(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(8) int local8 = (int) arg0.length();
			@Pc(25) DataInputStream local25 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(28) byte[] local28 = new byte[local8];
			local25.readFully(local28, 0, local8);
			local25.close();
			return local28;
		} catch (@Pc(38) IOException local38) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method1973(@OriginalArg(0) String arg0) {
		if (this.aBoolean135) {
			return;
		}
		this.aBoolean135 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(31) Exception local31) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;[BB)Z")
	private boolean method1974(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg1);
			@Pc(16) byte[] local16 = local8.digest();
			if (arg0 == "runescape.pack200?crc=2095819194") {
				if (local16[0] != -99 || local16[1] != -98 || local16[2] != -50 || local16[3] != 0 || local16[4] != -77 || local16[5] != -56 || local16[6] != 22 || local16[7] != -39 || local16[8] != -118 || local16[9] != 39 || local16[10] != -88 || local16[11] != -127 || local16[12] != -67 || local16[13] != 9 || local16[14] != -88 || local16[15] != -45 || local16[16] != 52 || local16[17] != 123 || local16[18] != -39 || local16[19] != -81) {
					return false;
				}
			} else if (arg0 == "runescape.js5?crc=604678077") {
				if (local16[0] != -3 || local16[1] != 17 || local16[2] != 115 || local16[3] != -81 || local16[4] != 97 || local16[5] != 60 || local16[6] != -78 || local16[7] != -62 || local16[8] != 45 || local16[9] != 100 || local16[10] != 125 || local16[11] != 26 || local16[12] != -90 || local16[13] != 114 || local16[14] != -11 || local16[15] != 37 || local16[16] != -66 || local16[17] != -1 || local16[18] != -93 || local16[19] != 126) {
					return false;
				}
			} else if (local16[0] != 3 || local16[1] != -21 || local16[2] != 65 || local16[3] != -60 || local16[4] != -33 || local16[5] != -24 || local16[6] != 92 || local16[7] != 4 || local16[8] != -2 || local16[9] != 48 || local16[10] != 106 || local16[11] != 50 || local16[12] != -46 || local16[13] != -31 || local16[14] != -44 || local16[15] != 120 || local16[16] != -104 || local16[17] != 72 || local16[18] != 50 || local16[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(396) Exception local396) {
			this.method1973("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
	}
}
