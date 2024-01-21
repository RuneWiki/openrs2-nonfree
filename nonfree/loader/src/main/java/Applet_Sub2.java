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

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Lloader!sb;")
	private Class70 aClass70_1;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt2949;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt2950;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean163;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method1854(@OriginalArg(1) String arg0) {
		if (this.aBoolean163) {
			return;
		}
		this.aBoolean163 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"));
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public void start() {
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public void destroy() {
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			this.anInt2949 = Integer.parseInt(this.getParameter("width"));
			this.anInt2950 = Integer.parseInt(this.getParameter("height"));
			@Pc(15) int local15 = 32;
			try {
				@Pc(20) int local20 = Integer.parseInt(this.getParameter("modewhat"));
				local15 += local20;
			} catch (@Pc(26) Exception local26) {
			}
			try {
				this.aClass70_1 = new Class70(true, this, InetAddress.getByName(this.getCodeBase().getHost()), local15, "runescape", 12);
			} catch (@Pc(42) Exception local42) {
				this.method1854("nocache");
				return;
			}
			@Pc(53) ClassLoader_Sub1 local53 = new ClassLoader_Sub1();
			@Pc(73) byte[] local73;
			try {
				Class.forName("java.util.jar.Pack200");
				local73 = this.method1856("runescape.pack200?crc=-1021861758", 197611, "game code", this.aClass70_1.aString15 + "main_file_cache.dat0");
				if (local73 == null) {
					return;
				}
				local53.aClass67_1 = new Class67_Sub1(local73);
			} catch (@Pc(87) Throwable local87) {
			}
			@Pc(120) Class local120;
			if (local53.aClass67_1 == null) {
				local73 = this.method1856("unpackclass.jar?crc=-549807395", 17836, "unpacker", this.aClass70_1.aString10 + "shared_game_unpacker.dat");
				if (local73 == null) {
					return;
				}
				local53.aClass67_1 = new Class67(local73);
				local120 = Class.forName("Class67");
				local53.aHashtable1.put(local120.getName(), local120);
				@Pc(131) Class local131 = local53.loadClass("unpackclass");
				local53 = new ClassLoader_Sub1();
				local73 = this.method1856("runescape.js5?crc=-1253725981", 210449, "game code", this.aClass70_1.aString15 + "main_file_cache.dat1");
				if (local73 == null) {
					return;
				}
				local53.aClass67_1 = (Class67) local131.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local73, Boolean.TRUE);
			}
			local120 = Class.forName("Class69");
			local53.aHashtable1.put(local120.getName(), local120);
			@Pc(196) Class local196 = Class.forName("Class70");
			local53.aHashtable1.put(local196.getName(), local196);
			local120 = Class.forName("Class68");
			local53.aHashtable1.put(local120.getName(), local120);
			local120 = Class.forName("Interface5");
			local53.aHashtable1.put(local120.getName(), local120);
			local120 = Class.forName("Interface6");
			local53.aHashtable1.put(local120.getName(), local120);
			local120 = local53.loadClass("client");
			this.anApplet2 = (Applet) local120.getDeclaredConstructor().newInstance();
			local120.getMethod("providesignlink", local196).invoke(null, this.aClass70_1);
			this.anApplet2.init();
			this.anApplet2.start();
		} catch (@Pc(269) Exception local269) {
			RuntimeException_Sub2.anInt2945 = -1253725981;
			if (local269 instanceof InvocationTargetException) {
				@Pc(278) Throwable local278 = ((InvocationTargetException) local269).getTargetException();
				if (local278 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method1850(local269.toString(), local278, this);
			} else {
				RuntimeException_Sub2.method1850(null, local269, this);
			}
			this.method1854("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	private byte[] method1855(@OriginalArg(0) String arg0) {
		try {
			@Pc(4) File local4 = new File(arg0);
			if (!local4.exists()) {
				return null;
			}
			@Pc(19) int local19 = (int) local4.length();
			@Pc(30) DataInputStream local30 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(33) byte[] local33 = new byte[local19];
			local30.readFully(local33, 0, local19);
			local30.close();
			return local33;
		} catch (@Pc(43) IOException local43) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public void init() {
		@Pc(4) Thread local4 = new Thread(this);
		local4.start();
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)[B")
	private byte[] method1856(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		@Pc(14) byte[] local14 = this.method1855(arg3);
		if (!this.method1857(local14, arg0)) {
			local14 = this.method1859(arg1, false, arg0, arg2);
			if (local14 == null) {
				local14 = this.method1859(arg1, true, arg0, arg2);
			}
			if (local14 == null) {
				this.method1854("download");
				return null;
			}
			if (!this.method1858(local14, arg3)) {
				return null;
			}
			local14 = this.method1855(arg3);
			if (!this.method1857(local14, arg0)) {
				this.method1854("mismatch");
				return null;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/lang/String;)Z")
	private boolean method1857(@OriginalArg(1) byte[] arg0, @OriginalArg(2) String arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg0);
			@Pc(16) byte[] local16 = local8.digest();
			if (arg1 == "runescape.pack200?crc=-1021861758") {
				if (local16[0] != -41 || local16[1] != -20 || local16[2] != 19 || local16[3] != 59 || local16[4] != 74 || local16[5] != -95 || local16[6] != -33 || local16[7] != -65 || local16[8] != 105 || local16[9] != 50 || local16[10] != -42 || local16[11] != -11 || local16[12] != 27 || local16[13] != 106 || local16[14] != -79 || local16[15] != -99 || local16[16] != 110 || local16[17] != 30 || local16[18] != -78 || local16[19] != 60) {
					return false;
				}
			} else if (arg1 == "runescape.js5?crc=-1253725981") {
				if (local16[0] != -120 || local16[1] != -36 || local16[2] != 104 || local16[3] != 2 || local16[4] != -117 || local16[5] != -126 || local16[6] != -28 || local16[7] != 95 || local16[8] != 60 || local16[9] != 69 || local16[10] != 93 || local16[11] != -91 || local16[12] != 98 || local16[13] != 57 || local16[14] != -108 || local16[15] != 53 || local16[16] != 29 || local16[17] != -46 || local16[18] != -118 || local16[19] != -84) {
					return false;
				}
			} else if (local16[0] != 3 || local16[1] != -21 || local16[2] != 65 || local16[3] != -60 || local16[4] != -33 || local16[5] != -24 || local16[6] != 92 || local16[7] != 4 || local16[8] != -2 || local16[9] != 48 || local16[10] != 106 || local16[11] != 50 || local16[12] != -46 || local16[13] != -31 || local16[14] != -44 || local16[15] != 120 || local16[16] != -104 || local16[17] != 72 || local16[18] != 50 || local16[19] != 95) {
				return false;
			}
			return true;
		} catch (@Pc(398) Exception local398) {
			this.method1854("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/lang/String;Z)Z")
	private boolean method1858(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(17) FileOutputStream local17 = new FileOutputStream(arg1);
			local17.write(arg0, 0, arg0.length);
			local17.close();
			return true;
		} catch (@Pc(28) IOException local28) {
			this.method1854("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IZBLjava/lang/String;Ljava/lang/String;)[B")
	private byte[] method1859(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(20) byte[] local20 = new byte[arg0];
		try {
			@Pc(30) InputStream local30;
			if (arg1) {
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
			@Pc(73) int local73 = -1;
			@Pc(75) int local75 = 0;
			while (local20.length > local75) {
				@Pc(89) int local89 = local20.length - local75;
				if (local89 > 1000) {
					local89 = 1000;
				}
				@Pc(102) int local102 = local30.read(local20, local75, local89);
				if (local102 < 0) {
					throw new EOFException();
				}
				local75 += local102;
				@Pc(119) int local119 = local75 * 100 / local20.length;
				if (local119 != local73) {
					try {
						@Pc(131) Graphics local131 = this.getGraphics();
						if (local131 == null) {
							this.repaint();
						} else {
							local131.setColor(Color.black);
							local131.fillRect(0, 0, this.anInt2949, this.anInt2950);
							local131.setColor(local17);
							local73 = local119;
							@Pc(164) String local164 = "Loading " + arg3 + " - " + local119 + "%";
							local131.drawRect(this.anInt2949 / 2 - 152, this.anInt2950 / 2 + -18, 303, 33);
							local131.setFont(local8);
							local131.setColor(Color.white);
							local131.drawString(local164, (this.anInt2949 - local12.stringWidth(local164)) / 2, this.anInt2950 / 2 + 4);
						}
					} catch (@Pc(209) Exception local209) {
					}
				}
			}
			local30.close();
		} catch (@Pc(226) IOException local226) {
			return null;
		}
		return this.method1857(local20, arg2) ? local20 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}
}
