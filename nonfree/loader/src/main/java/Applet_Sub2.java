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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Lloader!lc;")
	private Class71 aClass71_1;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt2827;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt2828;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean165;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method1854(@OriginalArg(0) String arg0) {
		if (this.aBoolean165) {
			return;
		}
		this.aBoolean165 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(28) Exception local28) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;[B)Z")
	private boolean method1855(@OriginalArg(1) String arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method1854("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			@Pc(3) int local3 = 32;
			this.anInt2827 = Integer.parseInt(this.getParameter("width"));
			this.anInt2828 = Integer.parseInt(this.getParameter("height"));
			try {
				@Pc(20) int local20 = Integer.parseInt(this.getParameter("modewhat"));
				local3 += local20;
			} catch (@Pc(26) Exception local26) {
			}
			try {
				this.aClass71_1 = new Class71(true, this, InetAddress.getByName(this.getCodeBase().getHost()), local3, "runescape", 13);
			} catch (@Pc(42) Exception local42) {
				this.method1854("nocache");
				return;
			}
			@Pc(53) ClassLoader_Sub1 local53 = new ClassLoader_Sub1();
			@Pc(73) byte[] local73;
			try {
				Class.forName("java.util.jar.Pack200");
				local73 = this.method1859(209152, "runescape.pack200?crc=-75502365", "game code", this.aClass71_1.aString15 + "main_file_cache.dat0");
				if (local73 == null) {
					return;
				}
				local53.aClass69_1 = new Class69_Sub1(local73);
			} catch (@Pc(84) Throwable local84) {
			}
			@Pc(121) Class local121;
			if (local53.aClass69_1 == null) {
				local73 = this.method1859(17836, "unpackclass.jar?crc=-549807395", "unpacker", this.aClass71_1.aString16 + "shared_game_unpacker.dat");
				if (local73 == null) {
					return;
				}
				local53.aClass69_1 = new Class69(local73);
				local121 = Class.forName("Class69");
				local53.aHashtable1.put(local121.getName(), local121);
				@Pc(132) Class local132 = local53.loadClass("unpackclass");
				local53 = new ClassLoader_Sub1();
				local73 = this.method1859(225496, "runescape.js5?crc=-126218491", "game code", this.aClass71_1.aString15 + "main_file_cache.dat1");
				if (local73 == null) {
					return;
				}
				local53.aClass69_1 = (Class69) local132.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local73, Boolean.TRUE);
			}
			local121 = Class.forName("Class72");
			local53.aHashtable1.put(local121.getName(), local121);
			@Pc(198) Class local198 = Class.forName("Class71");
			local53.aHashtable1.put(local198.getName(), local198);
			local121 = Class.forName("Class70");
			local53.aHashtable1.put(local121.getName(), local121);
			local121 = Class.forName("Interface6");
			local53.aHashtable1.put(local121.getName(), local121);
			local121 = Class.forName("Interface5");
			local53.aHashtable1.put(local121.getName(), local121);
			local121 = local53.loadClass("client");
			this.anApplet3 = (Applet) local121.getDeclaredConstructor().newInstance();
			local121.getMethod("providesignlink", local198).invoke(null, this.aClass71_1);
			this.anApplet3.init();
			this.anApplet3.start();
		} catch (@Pc(271) Exception local271) {
			RuntimeException_Sub2.anInt2820 = -126218491;
			if (local271 instanceof InvocationTargetException) {
				@Pc(280) Throwable local280 = ((InvocationTargetException) local271).getTargetException();
				if (local280 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method1824(this, local271.toString(), local280);
			} else {
				RuntimeException_Sub2.method1824(this, null, local271);
			}
			this.method1854("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;[B)Z")
	private boolean method1856(@OriginalArg(1) String arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg1);
			@Pc(21) byte[] local21 = local8.digest();
			if (arg0 == "runescape.pack200?crc=-75502365") {
				if (local21[0] != -39 || local21[1] != 14 || local21[2] != -77 || local21[3] != -15 || local21[4] != 23 || local21[5] != 126 || local21[6] != -94 || local21[7] != -50 || local21[8] != -124 || local21[9] != 52 || local21[10] != -101 || local21[11] != -1 || local21[12] != 113 || local21[13] != 117 || local21[14] != 37 || local21[15] != 73 || local21[16] != -109 || local21[17] != 22 || local21[18] != -12 || local21[19] != 85) {
					return false;
				}
			} else if (arg0 == "runescape.js5?crc=-126218491") {
				if (local21[0] != 9 || local21[1] != 105 || local21[2] != 31 || local21[3] != -37 || local21[4] != 0 || local21[5] != -100 || local21[6] != 1 || local21[7] != 70 || local21[8] != -68 || local21[9] != 41 || local21[10] != -100 || local21[11] != 81 || local21[12] != -50 || local21[13] != -67 || local21[14] != -52 || local21[15] != -125 || local21[16] != -27 || local21[17] != 41 || local21[18] != 101 || local21[19] != -25) {
					return false;
				}
			} else if (local21[0] != 3 || local21[1] != -21 || local21[2] != 65 || local21[3] != -60 || local21[4] != -33 || local21[5] != -24 || local21[6] != 92 || local21[7] != 4 || local21[8] != -2 || local21[9] != 48 || local21[10] != 106 || local21[11] != 50 || local21[12] != -46 || local21[13] != -31 || local21[14] != -44 || local21[15] != 120 || local21[16] != -104 || local21[17] != 72 || local21[18] != 50 || local21[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(396) Exception local396) {
			this.method1854("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IZLjava/lang/String;Ljava/lang/String;B)[B")
	private byte[] method1857(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(15) byte[] local15 = new byte[arg0];
		@Pc(20) Color local20 = new Color(9179409);
		try {
			@Pc(72) InputStream local72;
			if (arg1) {
				@Pc(36) URL local36 = this.getCodeBase();
				@Pc(44) Socket local44 = new Socket(InetAddress.getByName(local36.getHost()), 443);
				local44.setSoTimeout(10000);
				@Pc(50) OutputStream local50 = local44.getOutputStream();
				local50.write(17);
				local50.write(("JAGGRAB " + local36.getFile() + arg3 + "\n\n").getBytes());
				local72 = local44.getInputStream();
			} else {
				local72 = (new URL(this.getCodeBase(), arg3)).openStream();
			}
			@Pc(84) int local84 = -1;
			@Pc(86) int local86 = 0;
			while (local15.length > local86) {
				@Pc(95) int local95 = local15.length - local86;
				if (local95 > 1000) {
					local95 = 1000;
				}
				@Pc(110) int local110 = local72.read(local15, local86, local95);
				if (local110 < 0) {
					throw new EOFException();
				}
				local86 += local110;
				@Pc(127) int local127 = local86 * 100 / local15.length;
				if (local127 != local84) {
					try {
						@Pc(135) Graphics local135 = this.getGraphics();
						if (local135 == null) {
							this.repaint();
						} else {
							local84 = local127;
							@Pc(159) String local159 = "Loading " + arg2 + " - " + local127 + "%";
							local135.setColor(Color.black);
							local135.fillRect(0, 0, this.anInt2827, this.anInt2828);
							local135.setColor(local20);
							local135.drawRect(this.anInt2827 / 2 - 152, this.anInt2828 / 2 - 18, 303, 33);
							local135.setFont(local8);
							local135.setColor(Color.white);
							local135.drawString(local159, (this.anInt2827 - local12.stringWidth(local159)) / 2, this.anInt2828 / 2 + 4);
						}
					} catch (@Pc(215) Exception local215) {
					}
				}
			}
			local72.close();
		} catch (@Pc(221) IOException local221) {
			return null;
		}
		return this.method1856(arg3, local15) ? local15 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)[B")
	private byte[] method1858(@OriginalArg(1) String arg0) {
		try {
			@Pc(4) File local4 = new File(arg0);
			if (!local4.exists()) {
				return null;
			}
			@Pc(13) int local13 = (int) local4.length();
			@Pc(22) byte[] local22 = new byte[local13];
			@Pc(33) DataInputStream local33 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			local33.readFully(local22, 0, local13);
			local33.close();
			return local22;
		} catch (@Pc(43) IOException local43) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)[B")
	private byte[] method1859(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		@Pc(6) byte[] local6 = this.method1858(arg3);
		if (!this.method1856(arg1, local6)) {
			local6 = this.method1857(arg0, false, arg2, arg1);
			if (local6 == null) {
				local6 = this.method1857(arg0, true, arg2, arg1);
			}
			if (local6 == null) {
				this.method1854("download");
				return null;
			}
			if (!this.method1855(arg3, local6)) {
				return null;
			}
			local6 = this.method1858(arg3);
			if (!this.method1856(arg1, local6)) {
				this.method1854("mismatch");
				return null;
			}
		}
		return local6;
	}
}
