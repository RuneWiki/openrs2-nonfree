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

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString271;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString272;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private static int anInt6566 = 0;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt6564;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private int anInt6567;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean593 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean594 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt6565 = 0;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean595 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean596 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!a;I)[B")
	private byte[] method5796(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class221 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class224.anIntArray819[anInt6566]);
		@Pc(26) Color local26 = new Color(Class224.anIntArray818[anInt6566]);
		@Pc(30) byte[] local30 = new byte[arg1.anInt6559];
		try {
			@Pc(41) InputStream local41;
			if (arg0) {
				@Pc(46) URL local46 = this.getCodeBase();
				@Pc(54) Socket local54 = new Socket(InetAddress.getByName(local46.getHost()), 443);
				local54.setSoTimeout(10000);
				@Pc(60) OutputStream local60 = local54.getOutputStream();
				local60.write(17);
				local60.write(("JAGGRAB " + local46.getFile() + arg1.aString261 + "\n\n").getBytes());
				local41 = local54.getInputStream();
			} else {
				local41 = (new URL(this.getCodeBase(), arg1.aString261)).openStream();
			}
			@Pc(91) int local91 = -1;
			@Pc(93) int local93 = 0;
			while (local93 < local30.length) {
				@Pc(107) int local107 = local30.length - local93;
				if (local107 > 1000) {
					local107 = 1000;
				}
				@Pc(119) int local119 = local41.read(local30, local93, local107);
				if (local119 < 0) {
					throw new EOFException();
				}
				local93 += local119;
				@Pc(136) int local136 = local93 * 100 / local30.length;
				if (local136 != local91) {
					try {
						@Pc(147) Graphics local147 = this.getGraphics();
						if (local147 == null) {
							this.repaint();
						} else {
							local147.setColor(Color.black);
							local147.fillRect(0, 0, this.anInt6564, this.anInt6567);
							local147.setColor(local19);
							local147.drawRect(this.anInt6564 / 2 - 152, this.anInt6567 / 2 + -18, 303, 33);
							@Pc(200) String local200 = arg1.aStringArray47[this.anInt6565] + " - " + local136 + "%";
							local147.setFont(local8);
							local147.setColor(local26);
							local91 = local136;
							local147.drawString(local200, (this.anInt6564 - local12.stringWidth(local200)) / 2, this.anInt6567 / 2 + 4);
						}
					} catch (@Pc(228) Exception local228) {
					}
				}
			}
			local41.close();
			if (arg1.anInt6559 != arg1.anInt6558) {
				@Pc(242) byte[] local242 = new byte[arg1.anInt6558];
				@Pc(247) Inflater local247 = new Inflater(true);
				local247.setInput(local30);
				local30 = local242;
				local247.inflate(local242);
			}
		} catch (@Pc(258) Exception local258) {
			return null;
		}
		return this.method5799(arg1, false, local30) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean595 = false;
		this.aBoolean594 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BZLloader!kq;Lloader!a;)[B")
	private byte[] method5797(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class226 arg1, @OriginalArg(3) Class221 arg2) {
		@Pc(11) File local11;
		try {
			local11 = arg1.method5783(arg2.aString260);
		} catch (@Pc(13) Exception local13) {
			this.method5801("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method5798(local11);
		if (!this.method5799(arg2, arg0, local24)) {
			local24 = this.method5796(false, arg2);
			if (local24 == null) {
				local24 = this.method5796(true, arg2);
			}
			if (local24 == null) {
				this.method5801("download");
				return null;
			}
			if (!this.method5800(local24, local11)) {
				return null;
			}
			local24 = this.method5798(local11);
			if (!this.method5799(arg2, false, local24)) {
				this.method5801("mismatch");
				return null;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method5798(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(8) int local8 = (int) arg0.length();
			@Pc(19) DataInputStream local19 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(27) byte[] local27 = new byte[local8];
			local19.readFully(local27, 0, local8);
			local19.close();
			return local27;
		} catch (@Pc(37) IOException local37) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString271 = this.getParameter("unsignedurl");
			if (aString271 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(16) SecurityException local16) {
					this.aBoolean593 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString271), "_parent");
					} catch (@Pc(29) Exception local29) {
					}
					return;
				}
			}
			aString272 = this.getParameter("crashurl");
			@Pc(36) int local36 = 0;
			@Pc(40) String local40 = this.getParameter("cachesubdirid");
			if (local40 != null) {
				local36 = Integer.parseInt(local40);
				if (local36 < 0 || Class224.aStringArray48.length <= local36) {
					local36 = 0;
				}
			}
			@Pc(63) String local63 = this.getParameter("colourid");
			if (local63 != null) {
				anInt6566 = Integer.parseInt(local63);
				if (anInt6566 < 0 || Class224.anIntArray819.length <= anInt6566) {
					anInt6566 = 0;
				}
			}
			this.anInt6564 = this.getSize().width;
			this.anInt6567 = this.getSize().height;
			@Pc(92) int local92 = 32;
			try {
				@Pc(97) int local97 = Integer.parseInt(this.getParameter("modewhat"));
				local92 += local97;
			} catch (@Pc(103) Exception local103) {
			}
			try {
				@Pc(107) String local107 = this.getParameter("lang");
				if (local107 != null) {
					this.anInt6565 = Integer.parseInt(local107);
				}
			} catch (@Pc(116) Exception local116) {
			}
			@Pc(126) Class226 local126;
			try {
				local126 = new Class226(this, local92, Class224.aStringArray48[local36], 29);
			} catch (@Pc(128) Exception local128) {
				this.method5801("nocache");
				return;
			}
			@Pc(135) unpack local135 = null;
			@Pc(145) byte[] local145;
			try {
				Class.forName("java.util.jar.Pack200");
				local145 = this.method5797(false, local126, Class224.aClass221_2);
				if (local145 == null) {
					return;
				}
				local135 = new unpack_Sub1(local145);
			} catch (@Pc(156) Throwable local156) {
			}
			if (local135 == null) {
				local145 = this.method5797(false, local126, Class224.aClass221_1);
				if (local145 == null) {
					return;
				}
				@Pc(176) unpack local176 = new unpack(local145);
				@Pc(181) ClassLoader_Sub1 local181 = new ClassLoader_Sub1(local176);
				@Pc(184) Class local184 = Class.forName("unpack");
				local181.method5757(local184, local184.getName());
				@Pc(194) Class local194 = local181.loadClass("unpackclass");
				@Pc(201) byte[] local201 = this.method5797(false, local126, Class224.aClass221_3);
				if (local201 == null) {
					return;
				}
				local135 = (unpack) local194.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local201, Boolean.TRUE);
			}
			@Pc(236) ClassLoader_Sub1 local236 = new ClassLoader_Sub1(local135);
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
				for (@Pc(296) int local296 = 0; local296 < Class224.aClass221ArrayArray1[local238].length; local296++) {
					this.method5797(this.getParameter("suppress_sha") != null, local126, Class224.aClass221ArrayArray1[local238][local296]);
				}
			}
			if (Class224.aClass221Array1 != null) {
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
					this.method5797(this.getParameter("suppress_sha") != null, local126, Class224.aClass221Array1[local238]);
				}
			}
			@Pc(378) Class local378 = Class.forName("Class225");
			local236.method5757(local378, local378.getName());
			@Pc(387) Class local387 = Class.forName("Class226");
			local236.method5757(local387, local387.getName());
			@Pc(396) Class local396 = Class.forName("Class227");
			local236.method5757(local396, local396.getName());
			@Pc(405) Class local405 = Class.forName("Class228");
			local236.method5757(local405, local405.getName());
			@Pc(414) Class local414 = Class.forName("Interface11");
			local236.method5757(local414, local414.getName());
			@Pc(424) Class local424 = local236.loadClass("client");
			synchronized (this) {
				if (this.aBoolean596) {
					return;
				}
				this.anApplet3 = (Applet) local424.getDeclaredConstructor().newInstance();
				local424.getMethod("providesignlink", local387).invoke(null, local126);
				this.anApplet3.init();
				if (this.aBoolean595) {
					this.anApplet3.start();
				}
				if (this.aBoolean594) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(485) Exception local485) {
			RuntimeException_Sub2.anInt6560 = 1433845639;
			if (local485 instanceof InvocationTargetException) {
				@Pc(494) Throwable local494 = ((InvocationTargetException) local485).getTargetException();
				if (local494 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5753(this, local485.toString(), local494);
			} else {
				RuntimeException_Sub2.method5753(this, null, local485);
			}
			this.method5801("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!a;BZ[B)Z")
	private boolean method5799(@OriginalArg(0) Class221 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2) {
		try {
			if (arg2 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg2);
			@Pc(23) byte[] local23 = local10.digest();
			for (@Pc(25) int local25 = 0; local25 < 20; local25++) {
				if (arg0.anIntArray817[local25] != local23[local25]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(49) Exception local49) {
			this.method5801("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;B)Z")
	private boolean method5800(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			this.method5801("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean595 = true;
		this.aBoolean594 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method5801(@OriginalArg(1) String arg0) {
		if (this.aBoolean593) {
			return;
		}
		this.aBoolean593 = true;
		try {
			if (aString272 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString272 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean596 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean595 = this.aBoolean594 = false;
		this.aBoolean596 = true;
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

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}
}
