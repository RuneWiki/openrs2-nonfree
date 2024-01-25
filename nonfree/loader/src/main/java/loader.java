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

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString394;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString395;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private static int anInt6636 = 0;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt6638;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt6639;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt6637 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean492 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean493 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean494 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean495 = false;

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean494 = this.aBoolean493 = false;
		this.aBoolean492 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean494 = true;
		this.aBoolean493 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!d;B)[B")
	private byte[] method5900(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class224 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class223.anIntArray566[anInt6636]);
		@Pc(26) Color local26 = new Color(Class223.anIntArray565[anInt6636]);
		@Pc(30) byte[] local30 = new byte[arg1.anInt6628];
		try {
			@Pc(80) InputStream local80;
			if (arg0) {
				@Pc(43) URL local43 = this.getCodeBase();
				@Pc(51) Socket local51 = new Socket(InetAddress.getByName(local43.getHost()), 443);
				local51.setSoTimeout(10000);
				@Pc(57) OutputStream local57 = local51.getOutputStream();
				local57.write(17);
				local57.write(("JAGGRAB " + local43.getFile() + arg1.aString392 + "\n\n").getBytes());
				local80 = local51.getInputStream();
			} else {
				local80 = (new URL(this.getCodeBase(), arg1.aString392)).openStream();
			}
			@Pc(93) int local93 = -1;
			@Pc(95) int local95 = 0;
			while (local30.length > local95) {
				@Pc(109) int local109 = local30.length - local95;
				if (local109 > 1000) {
					local109 = 1000;
				}
				@Pc(122) int local122 = local80.read(local30, local95, local109);
				if (local122 < 0) {
					throw new EOFException();
				}
				local95 += local122;
				@Pc(143) int local143 = local95 * 100 / local30.length;
				if (local143 != local93) {
					try {
						@Pc(150) Graphics local150 = this.getGraphics();
						if (local150 == null) {
							this.repaint();
						} else {
							local150.setColor(Color.black);
							local150.fillRect(0, 0, this.anInt6638, this.anInt6639);
							local150.setColor(local19);
							local150.drawRect(this.anInt6638 / 2 - 152, this.anInt6639 / 2 - 18, 303, 33);
							@Pc(199) String local199 = arg1.aStringArray46[this.anInt6637] + " - " + local143 + "%";
							local150.setFont(local8);
							local150.setColor(local26);
							local150.drawString(local199, (this.anInt6638 - local12.stringWidth(local199)) / 2, this.anInt6639 / 2 + 4);
							local93 = local143;
						}
					} catch (@Pc(230) Exception local230) {
					}
				}
			}
			local80.close();
			if (arg1.anInt6628 != arg1.anInt6629) {
				@Pc(244) byte[] local244 = new byte[arg1.anInt6629];
				@Pc(249) Inflater local249 = new Inflater(true);
				local249.setInput(local30);
				local30 = local244;
				local249.inflate(local244);
			}
		} catch (@Pc(260) Exception local260) {
			return null;
		}
		return this.method5901(arg1, local30, false) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean492 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString395 = this.getParameter("unsignedurl");
			if (aString395 != null) {
				try {
					@Pc(11) SecurityManager local11 = System.getSecurityManager();
					if (local11 != null) {
						local11.checkExec("echo");
					}
				} catch (@Pc(19) SecurityException local19) {
					this.aBoolean495 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString395), "_parent");
					} catch (@Pc(32) Exception local32) {
					}
					return;
				}
			}
			aString394 = this.getParameter("crashurl");
			@Pc(39) int local39 = 0;
			@Pc(43) String local43 = this.getParameter("cachesubdirid");
			if (local43 != null) {
				local39 = Integer.parseInt(local43);
				if (local39 < 0 || Class223.aStringArray45.length <= local39) {
					local39 = 0;
				}
			}
			@Pc(62) String local62 = this.getParameter("colourid");
			if (local62 != null) {
				anInt6636 = Integer.parseInt(local62);
				if (anInt6636 < 0 || anInt6636 >= Class223.anIntArray566.length) {
					anInt6636 = 0;
				}
			}
			this.anInt6638 = this.getSize().width;
			this.anInt6639 = this.getSize().height;
			@Pc(93) int local93 = 32;
			try {
				@Pc(98) int local98 = Integer.parseInt(this.getParameter("modewhat"));
				local93 += local98;
			} catch (@Pc(104) Exception local104) {
			}
			try {
				@Pc(108) String local108 = this.getParameter("lang");
				if (local108 != null) {
					this.anInt6637 = Integer.parseInt(local108);
				}
			} catch (@Pc(117) Exception local117) {
			}
			@Pc(127) Class222 local127;
			try {
				local127 = new Class222(this, local93, Class223.aStringArray45[local39], 29);
			} catch (@Pc(129) Exception local129) {
				this.method5904("nocache");
				return;
			}
			@Pc(136) unpack local136 = null;
			@Pc(146) byte[] local146;
			try {
				Class.forName("java.util.jar.Pack200");
				local146 = this.method5903(false, Class223.aClass224_2, local127);
				if (local146 == null) {
					return;
				}
				local136 = new unpack_Sub1(local146);
			} catch (@Pc(157) Throwable local157) {
			}
			if (local136 == null) {
				local146 = this.method5903(false, Class223.aClass224_1, local127);
				if (local146 == null) {
					return;
				}
				@Pc(175) unpack local175 = new unpack(local146);
				@Pc(180) ClassLoader_Sub1 local180 = new ClassLoader_Sub1(local175);
				@Pc(183) Class local183 = Class.forName("unpack");
				local180.method5876(local183.getName(), local183);
				@Pc(193) Class local193 = local180.loadClass("unpackclass");
				@Pc(200) byte[] local200 = this.method5903(false, Class223.aClass224_3, local127);
				if (local200 == null) {
					return;
				}
				local136 = (unpack) local193.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local200, Boolean.TRUE);
			}
			@Pc(236) ClassLoader_Sub1 local236 = new ClassLoader_Sub1(local136);
			@Pc(238) byte local238 = -1;
			@Pc(242) String local242 = System.getProperty("os.name").toLowerCase();
			@Pc(246) String local246 = System.getProperty("os.arch").toLowerCase();
			if (local242.startsWith("win")) {
				if (local246.startsWith("amd64") || local246.startsWith("x86_64")) {
					local238 = 4;
				} else {
					local238 = 0;
				}
			} else if (local242.startsWith("linux")) {
				local238 = 1;
			} else if (local242.startsWith("mac")) {
				if (local246.startsWith("ppc")) {
					local238 = 2;
				} else {
					local238 = 3;
				}
			}
			if (local238 != -1) {
				for (@Pc(294) int local294 = 0; local294 < Class223.aClass224ArrayArray1[local238].length; local294++) {
					this.method5903(this.getParameter("suppress_sha") != null, Class223.aClass224ArrayArray1[local238][local294], local127);
				}
			}
			if (Class223.aClass224Array1 != null) {
				local238 = -1;
				local242 = System.getProperty("os.name").toLowerCase();
				local246 = System.getProperty("os.arch").toLowerCase();
				if (local242.startsWith("win")) {
					if (local246.startsWith("amd64") || local246.startsWith("x86_64")) {
						local238 = 2;
					} else {
						local238 = 0;
					}
				}
				if (local238 != -1) {
					this.method5903(this.getParameter("suppress_sha") != null, Class223.aClass224Array1[local238], local127);
				}
			}
			@Pc(374) Class local374 = Class.forName("Class227");
			local236.method5876(local374.getName(), local374);
			@Pc(383) Class local383 = Class.forName("Class222");
			local236.method5876(local383.getName(), local383);
			@Pc(392) Class local392 = Class.forName("Class225");
			local236.method5876(local392.getName(), local392);
			@Pc(401) Class local401 = Class.forName("Class228");
			local236.method5876(local401.getName(), local401);
			@Pc(410) Class local410 = Class.forName("Interface11");
			local236.method5876(local410.getName(), local410);
			@Pc(420) Class local420 = local236.loadClass("client");
			synchronized (this) {
				if (this.aBoolean492) {
					return;
				}
				this.anApplet3 = (Applet) local420.getDeclaredConstructor().newInstance();
				local420.getMethod("providesignlink", local383).invoke(null, local127);
				this.anApplet3.init();
				if (this.aBoolean494) {
					this.anApplet3.start();
				}
				if (this.aBoolean493) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(480) Exception local480) {
			RuntimeException_Sub2.anInt6630 = 2127035155;
			if (local480 instanceof InvocationTargetException) {
				@Pc(496) Throwable local496 = ((InvocationTargetException) local480).getTargetException();
				if (local496 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5879(local496, local480.toString(), this);
			} else {
				RuntimeException_Sub2.method5879(local480, null, this);
			}
			this.method5904("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean493 = true;
		this.aBoolean494 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!d;Z[BZ)Z")
	private boolean method5901(@OriginalArg(0) Class224 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(15) MessageDigest local15 = MessageDigest.getInstance("SHA");
			local15.reset();
			local15.update(arg1);
			@Pc(23) byte[] local23 = local15.digest();
			for (@Pc(25) int local25 = 0; local25 < 20; local25++) {
				if (local23[local25] != arg0.anIntArray567[local25]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(43) Exception local43) {
			this.method5904("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BZLjava/io/File;)Z")
	private boolean method5902(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method5904("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!d;Lloader!am;I)[B")
	private byte[] method5903(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) Class222 arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg2.method5852(arg1.aString391);
		} catch (@Pc(7) Exception local7) {
			this.method5904("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method5905(local5);
		if (!this.method5901(arg1, local24, arg0)) {
			local24 = this.method5900(false, arg1);
			if (local24 == null) {
				local24 = this.method5900(true, arg1);
			}
			if (local24 == null) {
				this.method5904("download");
				return null;
			}
			if (!this.method5902(local24, local5)) {
				return null;
			}
			local24 = this.method5905(local5);
			if (!this.method5901(arg1, local24, false)) {
				this.method5904("mismatch");
				return null;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method5904(@OriginalArg(0) String arg0) {
		if (this.aBoolean495) {
			return;
		}
		this.aBoolean495 = true;
		try {
			if (aString394 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString394 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(55) Exception local55) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/io/File;)[B")
	private byte[] method5905(@OriginalArg(1) File arg0) {
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
