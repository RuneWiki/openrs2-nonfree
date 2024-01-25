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
	private static String aString219;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString220;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private static int anInt9423 = 0;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt9424;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt9425;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean683 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean681 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean682 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean684 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt9426 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLloader!f;)Z")
	private boolean method7853(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class324 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(16) MessageDigest local16 = MessageDigest.getInstance("SHA");
			local16.reset();
			local16.update(arg0);
			@Pc(24) byte[] local24 = local16.digest();
			for (@Pc(26) int local26 = 0; local26 < 20; local26++) {
				if (arg1.anIntArray771[local26] != local24[local26]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(48) Exception local48) {
			this.method7857("sha");
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
					@Pc(8) SecurityManager local8 = System.getSecurityManager();
					if (local8 != null) {
						local8.checkExec("echo");
					}
				} catch (@Pc(16) SecurityException local16) {
					this.aBoolean683 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString220), "_parent");
					} catch (@Pc(29) Exception local29) {
					}
					return;
				}
			}
			aString219 = this.getParameter("crashurl");
			@Pc(36) int local36 = 0;
			@Pc(40) String local40 = this.getParameter("cachesubdirid");
			if (local40 != null) {
				local36 = Integer.parseInt(local40);
				if (local36 < 0 || Class323.aStringArray46.length <= local36) {
					local36 = 0;
				}
			}
			@Pc(63) String local63 = this.getParameter("colourid");
			if (local63 != null) {
				anInt9423 = Integer.parseInt(local63);
				if (anInt9423 < 0 || Class323.anIntArray769.length <= anInt9423) {
					anInt9423 = 0;
				}
			}
			this.anInt9424 = this.getSize().width;
			this.anInt9425 = this.getSize().height;
			@Pc(93) int local93 = 32;
			try {
				@Pc(98) int local98 = Integer.parseInt(this.getParameter("modewhat"));
				local93 += local98;
			} catch (@Pc(104) Exception local104) {
			}
			try {
				@Pc(108) String local108 = this.getParameter("lang");
				if (local108 != null) {
					this.anInt9426 = Integer.parseInt(local108);
				}
			} catch (@Pc(116) Exception local116) {
			}
			@Pc(126) Class328 local126;
			try {
				local126 = new Class328(this, local93, Class323.aStringArray46[local36], 32);
			} catch (@Pc(128) Exception local128) {
				this.method7857("nocache");
				return;
			}
			@Pc(135) unpack local135 = null;
			@Pc(144) byte[] local144;
			try {
				Class.forName("java.util.jar.Pack200");
				local144 = this.method7855(local126, Class323.aClass324_2);
				if (local144 == null) {
					return;
				}
				local135 = new unpack_Sub1(local144);
			} catch (@Pc(155) Throwable local155) {
			}
			if (local135 == null) {
				local144 = this.method7855(local126, Class323.aClass324_1);
				if (local144 == null) {
					return;
				}
				@Pc(172) unpack local172 = new unpack(local144);
				@Pc(177) ClassLoader_Sub1 local177 = new ClassLoader_Sub1(local172);
				@Pc(180) Class local180 = Class.forName("unpack");
				local177.method7842(local180, local180.getName());
				@Pc(190) Class local190 = local177.loadClass("unpackclass");
				@Pc(196) byte[] local196 = this.method7855(local126, Class323.aClass324_3);
				if (local196 == null) {
					return;
				}
				local135 = (unpack) local190.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local196, Boolean.TRUE);
			}
			@Pc(232) ClassLoader_Sub1 local232 = new ClassLoader_Sub1(local135);
			@Pc(235) Class local235 = Class.forName("Class327");
			local232.method7842(local235, local235.getName());
			@Pc(244) Class local244 = Class.forName("Class328");
			local232.method7842(local244, local244.getName());
			@Pc(253) Class local253 = Class.forName("Class321");
			local232.method7842(local253, local253.getName());
			@Pc(262) Class local262 = Class.forName("Class325");
			local232.method7842(local262, local262.getName());
			@Pc(271) Class local271 = Class.forName("Interface21");
			local232.method7842(local271, local271.getName());
			@Pc(281) Class local281 = local232.loadClass("client");
			synchronized (this) {
				if (this.aBoolean681) {
					return;
				}
				this.anApplet2 = (Applet) local281.getDeclaredConstructor().newInstance();
				local281.getMethod("providesignlink", local244).invoke(null, local126);
				this.anApplet2.init();
				if (this.aBoolean682) {
					this.anApplet2.start();
				}
				if (this.aBoolean684) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(340) Exception local340) {
			RuntimeException_Sub2.anInt9415 = 888521815;
			if (local340 instanceof InvocationTargetException) {
				@Pc(356) Throwable local356 = ((InvocationTargetException) local340).getTargetException();
				if (local356 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method7826(this, local356, local340.toString());
			} else {
				RuntimeException_Sub2.method7826(this, local340, null);
			}
			this.method7857("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;[B)Z")
	private boolean method7854(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method7857("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean681 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!uf;ZLloader!f;)[B")
	private byte[] method7855(@OriginalArg(0) Class328 arg0, @OriginalArg(2) Class324 arg1) {
		@Pc(5) File local5;
		try {
			local5 = arg0.method7880(arg1.aString217);
		} catch (@Pc(15) Exception local15) {
			this.method7857("nocache");
			return null;
		}
		@Pc(26) byte[] local26 = this.method7858(local5);
		if (!this.method7853(local26, arg1)) {
			local26 = this.method7856(arg1, false);
			if (local26 == null) {
				local26 = this.method7856(arg1, true);
			}
			if (local26 == null) {
				this.method7857("download");
				return null;
			}
			if (!this.method7854(local5, local26)) {
				return null;
			}
			local26 = this.method7858(local5);
			if (!this.method7853(local26, arg1)) {
				this.method7857("mismatch");
				return null;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean684 = false;
		this.aBoolean682 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!f;ZI)[B")
	private byte[] method7856(@OriginalArg(0) Class324 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(30) Color local30 = new Color(Class323.anIntArray769[anInt9423]);
		@Pc(37) Color local37 = new Color(Class323.anIntArray770[anInt9423]);
		@Pc(41) byte[] local41 = new byte[arg0.anInt9422];
		try {
			@Pc(52) InputStream local52;
			if (arg1) {
				@Pc(57) URL local57 = this.getCodeBase();
				@Pc(65) Socket local65 = new Socket(InetAddress.getByName(local57.getHost()), 443);
				local65.setSoTimeout(10000);
				@Pc(71) OutputStream local71 = local65.getOutputStream();
				local71.write(17);
				local71.write(("JAGGRAB " + local57.getFile() + arg0.aString218 + "\n\n").getBytes());
				local52 = local65.getInputStream();
			} else {
				local52 = (new URL(this.getCodeBase(), arg0.aString218)).openStream();
			}
			@Pc(96) int local96 = -1;
			@Pc(98) int local98 = 0;
			while (local98 < local41.length) {
				@Pc(111) int local111 = local41.length - local98;
				if (local111 > 1000) {
					local111 = 1000;
				}
				@Pc(123) int local123 = local52.read(local41, local98, local111);
				if (local123 < 0) {
					throw new EOFException();
				}
				local98 += local123;
				@Pc(143) int local143 = local98 * 100 / local41.length;
				if (local143 != local96) {
					try {
						@Pc(153) Graphics local153 = this.getGraphics();
						if (local153 == null) {
							this.repaint();
						} else {
							local153.setColor(Color.black);
							local153.fillRect(0, 0, this.anInt9424, this.anInt9425);
							local153.setColor(local30);
							local153.drawRect(this.anInt9424 / 2 - 152, this.anInt9425 / 2 - 18, 303, 33);
							@Pc(202) String local202 = arg0.aStringArray47[this.anInt9426] + " - " + local143 + "%";
							local153.setFont(local8);
							local153.setColor(local37);
							local96 = local143;
							local153.drawString(local202, (this.anInt9424 - local12.stringWidth(local202)) / 2, this.anInt9425 / 2 + 4);
						}
					} catch (@Pc(233) Exception local233) {
					}
				}
			}
			local52.close();
			if (arg0.anInt9421 != arg0.anInt9422) {
				@Pc(246) byte[] local246 = new byte[arg0.anInt9421];
				@Pc(251) Inflater local251 = new Inflater(true);
				local251.setInput(local41);
				local41 = local246;
				local251.inflate(local246);
			}
		} catch (@Pc(262) Exception local262) {
			return null;
		}
		return this.method7853(local41, arg0) ? local41 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private void method7857(@OriginalArg(1) String arg0) {
		if (this.aBoolean683) {
			return;
		}
		this.aBoolean683 = true;
		try {
			if (aString219 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString219 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean682 = false;
		this.aBoolean684 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean681 = true;
		this.aBoolean682 = this.aBoolean684 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method7858(@OriginalArg(1) File arg0) {
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
}
