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

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString220;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString221;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString222;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt6099;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt6100;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean408 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean407 = false;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt6098 = 32;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean410 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean409 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt6101 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private void method4808(@OriginalArg(0) String arg0) {
		if (this.aBoolean410) {
			return;
		}
		this.aBoolean410 = true;
		try {
			if (aString221 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString221 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(55) Exception local55) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean409 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean409 = true;
		this.aBoolean407 = this.aBoolean408 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!e;ZLloader!la;)[B")
	private byte[] method4809(@OriginalArg(1) Class199 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class200 arg2) {
		@Pc(9) File local9;
		try {
			local9 = Class200.method4802(arg0.aString210, aString222, this.anInt6098);
		} catch (@Pc(11) Exception local11) {
			this.method4808("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method4810(local9);
		if (!this.method4811(local24, arg1, arg0)) {
			local24 = this.method4813(false, arg0);
			if (local24 == null) {
				local24 = this.method4813(true, arg0);
			}
			if (local24 == null) {
				this.method4808("download");
				return null;
			}
			if (!this.method4812(local9, local24)) {
				return null;
			}
			local24 = this.method4810(local9);
			if (!this.method4811(local24, false, arg0)) {
				this.method4808("mismatch");
				return null;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean407 = false;
		this.aBoolean408 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method4810(@OriginalArg(1) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BZLloader!e;I)Z")
	private boolean method4811(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class199 arg2) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg0);
			@Pc(24) byte[] local24 = local10.digest();
			for (@Pc(26) int local26 = 0; local26 < 20; local26++) {
				if (arg2.anIntArray605[local26] != local24[local26]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(44) Exception local44) {
			this.method4808("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	private boolean method4812(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			this.method4808("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString220 = this.getParameter("unsignedurl");
			if (aString220 != null) {
				try {
					@Pc(11) SecurityManager local11 = System.getSecurityManager();
					if (local11 != null) {
						local11.checkExec("echo");
					}
				} catch (@Pc(20) SecurityException local20) {
					this.aBoolean410 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString220), "_parent");
					} catch (@Pc(33) Exception local33) {
					}
					return;
				}
			}
			@Pc(38) String local38 = this.getParameter("pre142url");
			@Pc(43) String local43;
			if (local38 != null) {
				try {
					local43 = System.getProperty("java.version");
					if (local43.startsWith("1.3.") || local43.startsWith("1.4.0") || local43.startsWith("1.4.1")) {
						this.getAppletContext().showDocument(new URL(local38), "_self");
					}
				} catch (@Pc(65) Exception local65) {
				}
			}
			aString221 = this.getParameter("crashurl");
			aString222 = this.getParameter("cachesubdir");
			if (aString222 == null) {
				aString222 = "runescape";
			}
			this.anInt6099 = this.getSize().width;
			this.anInt6100 = this.getSize().height;
			try {
				@Pc(93) int local93 = Integer.parseInt(this.getParameter("modewhat"));
				this.anInt6098 += local93;
			} catch (@Pc(101) Exception local101) {
			}
			try {
				local43 = this.getParameter("lang");
				if (local43 != null) {
					this.anInt6101 = Integer.parseInt(local43);
				}
			} catch (@Pc(115) Exception local115) {
			}
			@Pc(124) Class200 local124;
			try {
				local124 = new Class200(this, this.anInt6098, aString222, 29);
			} catch (@Pc(126) Exception local126) {
				this.method4808("nocache");
				return;
			}
			@Pc(135) ClassLoader_Sub1 local135 = new ClassLoader_Sub1();
			@Pc(145) byte[] local145;
			try {
				Class.forName("java.util.jar.Pack200");
				local145 = this.method4809(Class196.aClass199_2, false, local124);
				if (local145 == null) {
					return;
				}
				local135.anUnpack1 = new unpack_Sub1(local145);
				@Pc(162) byte[] local162 = this.method4809(Class196.aClass199_4, false, local124);
				if (local162 == null) {
					return;
				}
				local135.anUnpack2 = new unpack_Sub1(local162);
			} catch (@Pc(174) Throwable local174) {
			}
			@Pc(257) byte[] local257;
			if (local135.anUnpack1 == null) {
				local145 = this.method4809(Class196.aClass199_1, false, local124);
				if (local145 == null) {
					return;
				}
				@Pc(192) ClassLoader_Sub1 local192 = new ClassLoader_Sub1();
				local192.anUnpack1 = new unpack(local145);
				@Pc(201) Class local201 = Class.forName("unpack");
				local192.aHashtable1.put(local201.getName(), local201);
				@Pc(212) Class local212 = local192.loadClass("unpackclass");
				@Pc(219) byte[] local219 = this.method4809(Class196.aClass199_3, false, local124);
				if (local219 == null) {
					return;
				}
				local135.anUnpack1 = (unpack) local212.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local219, Boolean.TRUE);
				local257 = this.method4809(Class196.aClass199_5, false, local124);
				if (local257 == null) {
					return;
				}
				local135.anUnpack2 = (unpack) local212.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local257, Boolean.TRUE);
			}
			@Pc(292) String local292 = System.getProperty("os.name").toLowerCase();
			@Pc(296) String local296 = System.getProperty("os.arch").toLowerCase();
			@Pc(310) byte local310;
			if (local292.startsWith("win")) {
				if (local296.startsWith("amd64") || local296.startsWith("x86_64")) {
					local310 = 4;
				} else {
					local310 = 0;
				}
			} else if (local292.startsWith("linux")) {
				local310 = 1;
			} else if (!local292.startsWith("mac")) {
				this.method4808("os");
				return;
			} else if (local296.startsWith("ppc")) {
				local310 = 2;
			} else {
				local310 = 3;
			}
			for (@Pc(341) int local341 = 0; local341 < Class196.aClass199ArrayArray1[local310].length; local341++) {
				local257 = this.method4809(Class196.aClass199ArrayArray1[local310][local341], this.getParameter("suppress_sha") != null, local124);
				if (local257 == null) {
					return;
				}
			}
			if (Class196.aClass199Array1 != null) {
				@Pc(378) String local378 = System.getProperty("os.name").toLowerCase();
				if (local378.startsWith("win")) {
					local296 = System.getProperty("os.arch").toLowerCase();
					@Pc(397) byte local397;
					if (local296.startsWith("amd64") || local296.startsWith("x86_64")) {
						local397 = 2;
					} else {
						local397 = 0;
					}
					@Pc(415) byte[] local415 = this.method4809(Class196.aClass199Array1[local397], this.getParameter("suppress_sha") != null, local124);
					if (local415 == null) {
						return;
					}
				}
			}
			@Pc(423) Class local423 = Class.forName("Class201");
			local135.aHashtable1.put(local423.getName(), local423);
			@Pc(433) Class local433 = Class.forName("Class200");
			local135.aHashtable1.put(local433.getName(), local433);
			@Pc(443) Class local443 = Class.forName("Class202");
			local135.aHashtable1.put(local443.getName(), local443);
			@Pc(453) Class local453 = Class.forName("Class203");
			local135.aHashtable1.put(local453.getName(), local453);
			@Pc(463) Class local463 = Class.forName("Interface6");
			local135.aHashtable1.put(local463.getName(), local463);
			@Pc(474) Class local474 = local135.loadClass("client");
			synchronized (this) {
				if (this.aBoolean409) {
					return;
				}
				this.anApplet3 = (Applet) local474.getDeclaredConstructor().newInstance();
				local474.getMethod("providesignlink", local433).invoke(null, local124);
				this.anApplet3.init();
				if (this.aBoolean407) {
					this.anApplet3.start();
				}
				if (this.aBoolean408) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(533) Exception local533) {
			RuntimeException_Sub2.anInt6091 = 2060502990;
			if (local533 instanceof InvocationTargetException) {
				@Pc(542) Throwable local542 = ((InvocationTargetException) local533).getTargetException();
				if (local542 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method4777(this, local533.toString(), local542);
			} else {
				RuntimeException_Sub2.method4777(this, null, local533);
			}
			this.method4808("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!e;I)[B")
	private byte[] method4813(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class199 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(21) byte[] local21 = new byte[arg1.anInt6094];
		try {
			@Pc(63) InputStream local63;
			if (arg0) {
				@Pc(26) URL local26 = this.getCodeBase();
				@Pc(34) Socket local34 = new Socket(InetAddress.getByName(local26.getHost()), 443);
				local34.setSoTimeout(10000);
				@Pc(40) OutputStream local40 = local34.getOutputStream();
				local40.write(17);
				local40.write(("JAGGRAB " + local26.getFile() + arg1.aString211 + "\n\n").getBytes());
				local63 = local34.getInputStream();
			} else {
				local63 = (new URL(this.getCodeBase(), arg1.aString211)).openStream();
			}
			@Pc(76) int local76 = -1;
			@Pc(78) int local78 = 0;
			while (local21.length > local78) {
				@Pc(88) int local88 = local21.length - local78;
				if (local88 > 1000) {
					local88 = 1000;
				}
				@Pc(99) int local99 = local63.read(local21, local78, local88);
				if (local99 < 0) {
					throw new EOFException();
				}
				local78 += local99;
				@Pc(117) int local117 = local78 * 100 / local21.length;
				if (local117 != local76) {
					try {
						@Pc(123) Graphics local123 = this.getGraphics();
						if (local123 == null) {
							this.repaint();
						} else {
							local123.setColor(Color.black);
							local76 = local117;
							local123.fillRect(0, 0, this.anInt6099, this.anInt6100);
							local123.setColor(local17);
							local123.drawRect(this.anInt6099 / 2 - 152, this.anInt6100 / 2 + -18, 303, 33);
							@Pc(175) String local175 = arg1.aStringArray47[this.anInt6101] + " - " + local117 + "%";
							local123.setFont(local8);
							local123.setColor(Color.white);
							local123.drawString(local175, (this.anInt6099 - local12.stringWidth(local175)) / 2, this.anInt6100 / 2 + 4);
						}
					} catch (@Pc(205) Exception local205) {
					}
				}
			}
			local63.close();
			if (arg1.anInt6093 != arg1.anInt6094) {
				@Pc(218) byte[] local218 = new byte[arg1.anInt6093];
				@Pc(223) Inflater local223 = new Inflater(true);
				local223.setInput(local21);
				local223.inflate(local218);
				local21 = local218;
			}
		} catch (@Pc(234) Exception local234) {
			return null;
		}
		return this.method4811(local21, false, arg1) ? local21 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean408 = false;
		this.aBoolean407 = true;
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
}
