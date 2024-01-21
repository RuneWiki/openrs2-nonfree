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

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Lloader!ih;")
	private Class93 aClass93_1;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt3983;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt3984;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean277;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean276;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean275;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean278;

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method2824(@OriginalArg(0) String arg0) {
		if (this.aBoolean275) {
			return;
		}
		this.aBoolean275 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(35) Exception local35) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean277 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;II)[B")
	private byte[] method2825(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(11) byte[] local11 = new byte[arg3];
		@Pc(15) FontMetrics local15 = this.getFontMetrics(local8);
		@Pc(20) Color local20 = new Color(9179409);
		try {
			@Pc(61) InputStream local61;
			if (arg1) {
				@Pc(25) URL local25 = this.getCodeBase();
				@Pc(33) Socket local33 = new Socket(InetAddress.getByName(local25.getHost()), 443);
				local33.setSoTimeout(10000);
				@Pc(39) OutputStream local39 = local33.getOutputStream();
				local39.write(17);
				local39.write(("JAGGRAB " + local25.getFile() + arg2 + "\n\n").getBytes());
				local61 = local33.getInputStream();
			} else {
				local61 = (new URL(this.getCodeBase(), arg2)).openStream();
			}
			@Pc(73) int local73 = -1;
			@Pc(81) int local81 = 0;
			while (local11.length > local81) {
				@Pc(91) int local91 = local11.length - local81;
				if (local91 > 1000) {
					local91 = 1000;
				}
				@Pc(103) int local103 = local61.read(local11, local81, local91);
				if (local103 < 0) {
					throw new EOFException();
				}
				local81 += local103;
				@Pc(121) int local121 = local81 * 100 / local11.length;
				if (local73 != local121) {
					try {
						@Pc(128) Graphics local128 = this.getGraphics();
						if (local128 == null) {
							this.repaint();
						} else {
							local73 = local121;
							local128.setColor(Color.black);
							@Pc(149) String local149 = arg0 + " - " + local121 + "%";
							local128.fillRect(0, 0, this.anInt3983, this.anInt3984);
							local128.setColor(local20);
							local128.drawRect(this.anInt3983 / 2 - 152, this.anInt3984 / 2 - 18, 303, 33);
							local128.setFont(local8);
							local128.setColor(Color.white);
							local128.drawString(local149, (this.anInt3983 - local15.stringWidth(local149)) / 2, this.anInt3984 / 2 + 4);
						}
					} catch (@Pc(205) Exception local205) {
					}
				}
			}
			local61.close();
		} catch (@Pc(211) IOException local211) {
			return null;
		}
		return this.method2829(arg2, local11) ? local11 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean277 = true;
		this.aBoolean278 = this.aBoolean276 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;ILjava/lang/String;Ljava/lang/String;)[B")
	private byte[] method2826(@OriginalArg(0) int arg0, @OriginalArg(1) File arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		@Pc(9) byte[] local9 = this.method2828(arg1);
		if (!this.method2829(arg3, local9)) {
			local9 = this.method2825(arg2, false, arg3, arg0);
			if (local9 == null) {
				local9 = this.method2825(arg2, true, arg3, arg0);
			}
			if (local9 == null) {
				this.method2824("download");
				return null;
			}
			if (!this.method2827(local9, arg1)) {
				return null;
			}
			local9 = this.method2828(arg1);
			if (!this.method2829(arg3, local9)) {
				this.method2824("mismatch");
				return null;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean278 = true;
		this.aBoolean276 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean276 = true;
		this.aBoolean278 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt3983 = Integer.parseInt(this.getParameter("width"));
			this.anInt3984 = Integer.parseInt(this.getParameter("height"));
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
					local28 = "Lade Entpacker";
					local26 = "Lade Spiel-Code";
				}
			} catch (@Pc(45) Exception local45) {
			}
			try {
				this.aClass93_1 = new Class93(true, this, local13, "runescape", 16);
			} catch (@Pc(57) Exception local57) {
				this.method2824("nocache");
				return;
			}
			@Pc(68) ClassLoader_Sub1 local68 = new ClassLoader_Sub1();
			@Pc(85) byte[] local85;
			try {
				Class.forName("java.util.jar.Pack200");
				local85 = this.method2826(277553, new File(this.aClass93_1.aFile5, "main_file_cache.dat0"), local26, "runescape_-1344327785.pack200");
				if (local85 == null) {
					return;
				}
				local68.aClass90_1 = new Class90_Sub1(local85);
			} catch (@Pc(97) Throwable local97) {
			}
			@Pc(126) Class local126;
			if (local68.aClass90_1 == null) {
				local85 = this.method2826(19185, new File(this.aClass93_1.aFile5, "game_unpacker.dat"), local28, "unpackclass_-163111980.jar");
				if (local85 == null) {
					return;
				}
				local68.aClass90_1 = new Class90(local85);
				local126 = Class.forName("Class90");
				local68.aHashtable3.put(local126.getName(), local126);
				@Pc(137) Class local137 = local68.loadClass("unpackclass");
				local68 = new ClassLoader_Sub1();
				local85 = this.method2826(283660, new File(this.aClass93_1.aFile5, "main_file_cache.dat1"), local26, "runescape_-403057138.js5");
				if (local85 == null) {
					return;
				}
				local68.aClass90_1 = (Class90) local137.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local85, Boolean.TRUE);
			}
			local126 = Class.forName("Class91");
			local68.aHashtable3.put(local126.getName(), local126);
			@Pc(198) Class local198 = Class.forName("Class93");
			local68.aHashtable3.put(local198.getName(), local198);
			local126 = Class.forName("Class92");
			local68.aHashtable3.put(local126.getName(), local126);
			local126 = Class.forName("Interface4");
			local68.aHashtable3.put(local126.getName(), local126);
			local126 = local68.loadClass("client");
			synchronized (this) {
				if (this.aBoolean277) {
					return;
				}
				this.anApplet3 = (Applet) local126.getDeclaredConstructor().newInstance();
				local126.getMethod("providesignlink", local198).invoke(null, this.aClass93_1);
				this.anApplet3.init();
				if (this.aBoolean278) {
					this.anApplet3.start();
				}
				if (this.aBoolean276) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(290) Exception local290) {
			RuntimeException_Sub2.anInt3978 = -403057138;
			if (local290 instanceof InvocationTargetException) {
				@Pc(299) Throwable local299 = ((InvocationTargetException) local290).getTargetException();
				if (local299 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2806(this, local299, local290.toString());
			} else {
				RuntimeException_Sub2.method2806(this, local290, null);
			}
			this.method2824("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/io/File;)Z")
	private boolean method2827(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method2824("savefile");
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method2828(@OriginalArg(0) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;[B)Z")
	private boolean method2829(@OriginalArg(1) String arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(22) MessageDigest local22 = MessageDigest.getInstance("SHA");
			local22.reset();
			local22.update(arg1);
			@Pc(30) byte[] local30 = local22.digest();
			if (arg0 == "runescape_-1344327785.pack200") {
				if (local30[0] != 91 || local30[1] != 55 || local30[2] != 1 || local30[3] != -26 || local30[4] != 124 || local30[5] != -31 || local30[6] != -36 || local30[7] != -46 || local30[8] != -55 || local30[9] != 92 || local30[10] != -87 || local30[11] != 73 || local30[12] != -88 || local30[13] != 62 || local30[14] != -61 || local30[15] != 37 || local30[16] != -41 || local30[17] != -58 || local30[18] != -37 || local30[19] != -123) {
					return false;
				}
			} else if (arg0 == "runescape_-403057138.js5") {
				if (local30[0] != -9 || local30[1] != 41 || local30[2] != -125 || local30[3] != -92 || local30[4] != -92 || local30[5] != 55 || local30[6] != -103 || local30[7] != 13 || local30[8] != 38 || local30[9] != -119 || local30[10] != -120 || local30[11] != -124 || local30[12] != 108 || local30[13] != -89 || local30[14] != 41 || local30[15] != -18 || local30[16] != 25 || local30[17] != -127 || local30[18] != 53 || local30[19] != -44) {
					return false;
				}
			} else if (local30[0] != 23 || local30[1] != 83 || local30[2] != 57 || local30[3] != 35 || local30[4] != 83 || local30[5] != -48 || local30[6] != 29 || local30[7] != -121 || local30[8] != 101 || local30[9] != 45 || local30[10] != -13 || local30[11] != -62 || local30[12] != -10 || local30[13] != 46 || local30[14] != -57 || local30[15] != -48 || local30[16] != 115 || local30[17] != 102 || local30[18] != 94 || local30[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(398) Exception local398) {
			this.method2824("sha");
			return false;
		}
	}
}
