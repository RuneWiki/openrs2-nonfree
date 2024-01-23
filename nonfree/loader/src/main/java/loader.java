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
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!loader")
public final class loader extends Applet implements Runnable {

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString206;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString207;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt5937;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt5938;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt5935 = 0;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt5936 = 32;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean477 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean476 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean479 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean478 = false;

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean476 = true;
		this.aBoolean478 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean479 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;Z)[B")
	private byte[] method4901(@OriginalArg(0) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean479 = true;
		this.aBoolean478 = this.aBoolean476 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BBLloader!d;)Z")
	private boolean method4902(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class206 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(15) MessageDigest local15 = MessageDigest.getInstance("SHA");
			local15.reset();
			local15.update(arg0);
			@Pc(23) byte[] local23 = local15.digest();
			for (@Pc(25) int local25 = 0; local25 < 20; local25++) {
				if (local23[local25] != arg1.anIntArray699[local25]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(49) Exception local49) {
			this.method4906("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!d;Z)[B")
	private byte[] method4903(@OriginalArg(1) Class206 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(18) FontMetrics local18 = this.getFontMetrics(local8);
		@Pc(23) Color local23 = new Color(9179409);
		@Pc(27) byte[] local27 = new byte[arg0.anInt5930];
		try {
			@Pc(38) InputStream local38;
			if (arg1) {
				@Pc(43) URL local43 = this.getCodeBase();
				@Pc(51) Socket local51 = new Socket(InetAddress.getByName(local43.getHost()), 443);
				local51.setSoTimeout(10000);
				@Pc(57) OutputStream local57 = local51.getOutputStream();
				local57.write(17);
				local57.write(("JAGGRAB " + local43.getFile() + arg0.aString196 + "\n\n").getBytes());
				local38 = local51.getInputStream();
			} else {
				local38 = (new URL(this.getCodeBase(), arg0.aString196)).openStream();
			}
			@Pc(82) int local82 = -1;
			@Pc(84) int local84 = 0;
			while (local84 < local27.length) {
				@Pc(94) int local94 = local27.length - local84;
				if (local94 > 1000) {
					local94 = 1000;
				}
				@Pc(106) int local106 = local38.read(local27, local84, local94);
				if (local106 < 0) {
					throw new EOFException();
				}
				local84 += local106;
				@Pc(123) int local123 = local84 * 100 / local27.length;
				if (local82 != local123) {
					try {
						@Pc(130) Graphics local130 = this.getGraphics();
						if (local130 == null) {
							this.repaint();
						} else {
							local82 = local123;
							local130.setColor(Color.black);
							local130.fillRect(0, 0, this.anInt5938, this.anInt5937);
							local130.setColor(local23);
							local130.drawRect(this.anInt5938 / 2 - 152, this.anInt5937 / 2 + -18, 303, 33);
							@Pc(182) String local182 = arg0.aStringArray42[this.anInt5935] + " - " + local123 + "%";
							local130.setFont(local8);
							local130.setColor(Color.white);
							local130.drawString(local182, (this.anInt5938 - local18.stringWidth(local182)) / 2, this.anInt5937 / 2 + 4);
						}
					} catch (@Pc(211) Exception local211) {
					}
				}
			}
			local38.close();
			if (arg0.anInt5930 != arg0.anInt5931) {
				@Pc(228) byte[] local228 = new byte[arg0.anInt5931];
				@Pc(233) Inflater local233 = new Inflater(true);
				local233.setInput(local27);
				local233.inflate(local228);
				local27 = local228;
			}
		} catch (@Pc(244) Exception local244) {
			return null;
		}
		return this.method4902(local27, arg0) ? local27 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;[BI)Z")
	private boolean method4904(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			this.method4906("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!jh;Lloader!d;B)[B")
	private byte[] method4905(@OriginalArg(0) Class208 arg0, @OriginalArg(1) Class206 arg1) {
		@Pc(13) File local13;
		try {
			local13 = Class208.method4893("runescape", arg1.aString197, this.anInt5936);
		} catch (@Pc(15) Exception local15) {
			this.method4906("nocache");
			return null;
		}
		@Pc(26) byte[] local26 = this.method4901(local13);
		if (!this.method4902(local26, arg1)) {
			local26 = this.method4903(arg1, false);
			if (local26 == null) {
				local26 = this.method4903(arg1, true);
			}
			if (local26 == null) {
				this.method4906("download");
				return null;
			}
			if (!this.method4904(local13, local26)) {
				return null;
			}
			local26 = this.method4901(local13);
			if (!this.method4902(local26, arg1)) {
				this.method4906("mismatch");
				return null;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method4906(@OriginalArg(0) String arg0) {
		if (this.aBoolean477) {
			return;
		}
		this.aBoolean477 = true;
		try {
			if (aString207 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString207 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean476 = false;
		this.aBoolean478 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString206 = this.getParameter("unsignedurl");
			if (aString206 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(19) SecurityException local19) {
					this.aBoolean477 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString206), "_parent");
					} catch (@Pc(32) Exception local32) {
					}
					return;
				}
			}
			@Pc(37) String local37 = this.getParameter("pre142url");
			@Pc(44) String local44;
			if (local37 != null) {
				try {
					local44 = System.getProperty("java.version");
					if (local44.startsWith("1.3.") || local44.startsWith("1.4.0") || local44.startsWith("1.4.1")) {
						this.getAppletContext().showDocument(new URL(local37), "_self");
					}
				} catch (@Pc(67) Exception local67) {
				}
			}
			aString207 = this.getParameter("crashurl");
			this.anInt5938 = this.getSize().width;
			this.anInt5937 = this.getSize().height;
			try {
				@Pc(86) int local86 = Integer.parseInt(this.getParameter("modewhat"));
				this.anInt5936 += local86;
			} catch (@Pc(94) Exception local94) {
			}
			try {
				local44 = this.getParameter("lang");
				if (local44 != null) {
					this.anInt5935 = Integer.parseInt(local44);
				}
			} catch (@Pc(106) Exception local106) {
			}
			@Pc(115) Class208 local115;
			try {
				local115 = new Class208(this, this.anInt5936, "runescape", 29);
			} catch (@Pc(117) Exception local117) {
				this.method4906("nocache");
				return;
			}
			@Pc(126) ClassLoader_Sub1 local126 = new ClassLoader_Sub1();
			@Pc(135) byte[] local135;
			try {
				Class.forName("java.util.jar.Pack200");
				local135 = this.method4905(local115, Class207.aClass206_2);
				if (local135 == null) {
					return;
				}
				local126.anUnpack2 = new unpack_Sub1(local135);
				@Pc(151) byte[] local151 = this.method4905(local115, Class207.aClass206_4);
				if (local151 == null) {
					return;
				}
				local126.anUnpack1 = new unpack_Sub1(local151);
			} catch (@Pc(162) Throwable local162) {
			}
			@Pc(244) byte[] local244;
			if (local126.anUnpack2 == null) {
				local135 = this.method4905(local115, Class207.aClass206_1);
				if (local135 == null) {
					return;
				}
				@Pc(180) ClassLoader_Sub1 local180 = new ClassLoader_Sub1();
				local180.anUnpack2 = new unpack(local135);
				@Pc(189) Class local189 = Class.forName("unpack");
				local180.aHashtable1.put(local189.getName(), local189);
				@Pc(200) Class local200 = local180.loadClass("unpackclass");
				@Pc(206) byte[] local206 = this.method4905(local115, Class207.aClass206_3);
				if (local206 == null) {
					return;
				}
				local126.anUnpack2 = (unpack) local200.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local206, Boolean.TRUE);
				local244 = this.method4905(local115, Class207.aClass206_5);
				if (local244 == null) {
					return;
				}
				local126.anUnpack1 = (unpack) local200.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local244, Boolean.TRUE);
			}
			@Pc(279) String local279 = System.getProperty("os.name").toLowerCase();
			@Pc(283) String local283 = System.getProperty("os.arch").toLowerCase();
			@Pc(301) byte local301;
			if (local279.startsWith("win")) {
				if (local283.startsWith("amd64") || local283.startsWith("x86_64")) {
					local301 = 1;
				} else {
					local301 = 0;
				}
			} else if (local279.startsWith("linux")) {
				if (local283.startsWith("amd64") || local283.startsWith("x86_64")) {
					local301 = 3;
				} else {
					local301 = 2;
				}
			} else if (!local279.startsWith("mac")) {
				if (!local279.startsWith("sunos")) {
					this.method4906("os");
					return;
				}
				if (local283.startsWith("amd64") || local283.startsWith("x86_64")) {
					local301 = 6;
				} else if (local283.startsWith("sparc")) {
					local301 = 8;
				} else if (local283.startsWith("sparcv9")) {
					local301 = 9;
				} else {
					local301 = 7;
				}
			} else if (local283.startsWith("ppc")) {
				local301 = 4;
			} else {
				local301 = 5;
			}
			for (@Pc(371) int local371 = 0; local371 < Class207.aClass206ArrayArray1[local301].length; local371++) {
				local244 = this.method4905(local115, Class207.aClass206ArrayArray1[local301][local371]);
				if (local244 == null) {
					return;
				}
			}
			@Pc(396) Class local396 = Class.forName("Class209");
			local126.aHashtable1.put(local396.getName(), local396);
			@Pc(406) Class local406 = Class.forName("Class208");
			local126.aHashtable1.put(local406.getName(), local406);
			@Pc(416) Class local416 = Class.forName("Class210");
			local126.aHashtable1.put(local416.getName(), local416);
			@Pc(426) Class local426 = Class.forName("Class211");
			local126.aHashtable1.put(local426.getName(), local426);
			@Pc(436) Class local436 = Class.forName("Interface10");
			local126.aHashtable1.put(local436.getName(), local436);
			@Pc(447) Class local447 = local126.loadClass("client");
			synchronized (this) {
				if (this.aBoolean479) {
					return;
				}
				this.anApplet3 = (Applet) local447.getDeclaredConstructor().newInstance();
				local447.getMethod("providesignlink", local406).invoke(null, local115);
				this.anApplet3.init();
				if (this.aBoolean478) {
					this.anApplet3.start();
				}
				if (this.aBoolean476) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(508) Exception local508) {
			RuntimeException_Sub2.anInt5928 = -1936798622;
			if (local508 instanceof InvocationTargetException) {
				@Pc(517) Throwable local517 = ((InvocationTargetException) local508).getTargetException();
				if (local517 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method4860(local517, this, local508.toString());
			} else {
				RuntimeException_Sub2.method4860(local508, this, null);
			}
			this.method4906("crash");
		}
	}
}
