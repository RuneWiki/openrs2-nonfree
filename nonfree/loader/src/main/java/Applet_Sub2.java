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

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Lloader!oc;")
	private Class85 aClass85_1;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt3273;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt3274;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean127;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;[BI)Z")
	private boolean method2276(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(26) IOException local26) {
			this.method2280("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;IZILjava/lang/String;)[B")
	private byte[] method2277(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(16) byte[] local16 = new byte[arg1];
		@Pc(20) FontMetrics local20 = this.getFontMetrics(local8);
		@Pc(25) Color local25 = new Color(9179409);
		try {
			@Pc(35) InputStream local35;
			if (arg2) {
				@Pc(40) URL local40 = this.getCodeBase();
				@Pc(48) Socket local48 = new Socket(InetAddress.getByName(local40.getHost()), 443);
				local48.setSoTimeout(10000);
				@Pc(54) OutputStream local54 = local48.getOutputStream();
				local54.write(17);
				local54.write(("JAGGRAB " + local40.getFile() + arg3 + "\n\n").getBytes());
				local35 = local48.getInputStream();
			} else {
				local35 = (new URL(this.getCodeBase(), arg3)).openStream();
			}
			@Pc(78) int local78 = -1;
			@Pc(80) int local80 = 0;
			while (local80 < local16.length) {
				@Pc(89) int local89 = local16.length - local80;
				if (local89 > 1000) {
					local89 = 1000;
				}
				@Pc(100) int local100 = local35.read(local16, local80, local89);
				if (local100 < 0) {
					throw new EOFException();
				}
				local80 += local100;
				@Pc(121) int local121 = local80 * 100 / local16.length;
				if (local121 != local78) {
					try {
						@Pc(132) Graphics local132 = this.getGraphics();
						if (local132 == null) {
							this.repaint();
						} else {
							local132.setColor(Color.black);
							local78 = local121;
							@Pc(152) String local152 = arg0 + " - " + local121 + "%";
							local132.fillRect(0, 0, this.anInt3274, this.anInt3273);
							local132.setColor(local25);
							local132.drawRect(this.anInt3274 / 2 - 152, this.anInt3273 / 2 + -18, 303, 33);
							local132.setFont(local8);
							local132.setColor(Color.white);
							local132.drawString(local152, (this.anInt3274 - local20.stringWidth(local152)) / 2, this.anInt3273 / 2 + 4);
						}
					} catch (@Pc(209) Exception local209) {
					}
				}
			}
			local35.close();
		} catch (@Pc(215) IOException local215) {
			return null;
		}
		return this.method2278(local16, arg3) ? local16 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Z[BLjava/lang/String;)Z")
	private boolean method2278(@OriginalArg(1) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg0);
			@Pc(21) byte[] local21 = local8.digest();
			if (arg1 == "runescape_-1232284088.pack200") {
				if (local21[0] != 81 || local21[1] != 92 || local21[2] != -48 || local21[3] != -123 || local21[4] != 40 || local21[5] != 37 || local21[6] != -112 || local21[7] != 123 || local21[8] != 5 || local21[9] != -59 || local21[10] != -70 || local21[11] != 52 || local21[12] != -69 || local21[13] != -29 || local21[14] != 92 || local21[15] != -111 || local21[16] != 94 || local21[17] != -122 || local21[18] != 72 || local21[19] != 61) {
					return false;
				}
			} else if (arg1 == "runescape_-2094973.js5") {
				if (local21[0] != -38 || local21[1] != 95 || local21[2] != -49 || local21[3] != -48 || local21[4] != -87 || local21[5] != -110 || local21[6] != 127 || local21[7] != 86 || local21[8] != 117 || local21[9] != 8 || local21[10] != 112 || local21[11] != 41 || local21[12] != 118 || local21[13] != -74 || local21[14] != 50 || local21[15] != 31 || local21[16] != -47 || local21[17] != -13 || local21[18] != -50 || local21[19] != 119) {
					return false;
				}
			} else if (local21[0] != 23 || local21[1] != 83 || local21[2] != 57 || local21[3] != 35 || local21[4] != 83 || local21[5] != -48 || local21[6] != 29 || local21[7] != -121 || local21[8] != 101 || local21[9] != 45 || local21[10] != -13 || local21[11] != -62 || local21[12] != -10 || local21[13] != 46 || local21[14] != -57 || local21[15] != -48 || local21[16] != 115 || local21[17] != 102 || local21[18] != 94 || local21[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(391) Exception local391) {
			this.method2280("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Ljava/io/File;ILjava/lang/String;I)[B")
	private byte[] method2279(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		@Pc(4) byte[] local4 = this.method2281(arg1);
		if (!this.method2278(local4, arg3)) {
			local4 = this.method2277(arg0, arg2, false, arg3);
			if (local4 == null) {
				local4 = this.method2277(arg0, arg2, true, arg3);
			}
			if (local4 == null) {
				this.method2280("download");
				return null;
			}
			if (!this.method2276(arg1, local4)) {
				return null;
			}
			local4 = this.method2281(arg1);
			if (!this.method2278(local4, arg3)) {
				this.method2280("mismatch");
				return null;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private void method2280(@OriginalArg(1) String arg0) {
		if (this.aBoolean127) {
			return;
		}
		this.aBoolean127 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(29) Exception local29) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public void stop() {
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt3274 = Integer.parseInt(this.getParameter("width"));
			this.anInt3273 = Integer.parseInt(this.getParameter("height"));
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
			try {
				this.aClass85_1 = new Class85(true, this, local13, "runescape", 16);
			} catch (@Pc(57) Exception local57) {
				this.method2280("nocache");
				return;
			}
			@Pc(68) ClassLoader_Sub1 local68 = new ClassLoader_Sub1();
			@Pc(85) byte[] local85;
			try {
				Class.forName("java.util.jar.Pack200");
				local85 = this.method2279(local26, new File(this.aClass85_1.aFile6, "main_file_cache.dat0"), 233705, "runescape_-1232284088.pack200");
				if (local85 == null) {
					return;
				}
				local68.aClass82_1 = new Class82_Sub1(local85);
			} catch (@Pc(98) Throwable local98) {
			}
			@Pc(128) Class local128;
			if (local68.aClass82_1 == null) {
				local85 = this.method2279(local28, new File(this.aClass85_1.aFile6, "game_unpacker.dat"), 19185, "unpackclass_-163111980.jar");
				if (local85 == null) {
					return;
				}
				local68.aClass82_1 = new Class82(local85);
				local128 = Class.forName("Class82");
				local68.aHashtable1.put(local128.getName(), local128);
				@Pc(139) Class local139 = local68.loadClass("unpackclass");
				local68 = new ClassLoader_Sub1();
				local85 = this.method2279(local26, new File(this.aClass85_1.aFile6, "main_file_cache.dat1"), 249605, "runescape_-2094973.js5");
				if (local85 == null) {
					return;
				}
				local68.aClass82_1 = (Class82) local139.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local85, Boolean.TRUE);
			}
			local128 = Class.forName("Class83");
			local68.aHashtable1.put(local128.getName(), local128);
			@Pc(201) Class local201 = Class.forName("Class85");
			local68.aHashtable1.put(local201.getName(), local201);
			local128 = Class.forName("Class84");
			local68.aHashtable1.put(local128.getName(), local128);
			local128 = Class.forName("Interface4");
			local68.aHashtable1.put(local128.getName(), local128);
			local128 = local68.loadClass("client");
			this.anApplet2 = (Applet) local128.getDeclaredConstructor().newInstance();
			local128.getMethod("providesignlink", local201).invoke(null, this.aClass85_1);
			this.anApplet2.init();
			this.anApplet2.start();
		} catch (@Pc(264) Exception local264) {
			RuntimeException_Sub2.anInt3272 = -2094973;
			if (local264 instanceof InvocationTargetException) {
				@Pc(273) Throwable local273 = ((InvocationTargetException) local264).getTargetException();
				if (local273 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method2268(local273, local264.toString(), this);
			} else {
				RuntimeException_Sub2.method2268(local264, null, this);
			}
			this.method2280("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;)[B")
	private byte[] method2281(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(8) int local8 = (int) arg0.length();
			@Pc(19) DataInputStream local19 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(28) byte[] local28 = new byte[local8];
			local19.readFully(local28, 0, local8);
			local19.close();
			return local28;
		} catch (@Pc(38) IOException local38) {
			return null;
		}
	}
}
