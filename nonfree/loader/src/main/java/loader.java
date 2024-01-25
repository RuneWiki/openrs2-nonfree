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
	private static String aString78;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString79;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private static int anInt7679 = 0;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt7680;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt7681;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean540 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean543 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean541 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt7678 = 0;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean542 = false;

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean540 = this.aBoolean543 = false;
		this.aBoolean542 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method6093(@OriginalArg(0) String arg0) {
		if (this.aBoolean541) {
			return;
		}
		this.aBoolean541 = true;
		try {
			if (aString79 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString79 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZZLloader!f;)[B")
	private byte[] method6094(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class277 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class273.anIntArray576[anInt7679]);
		@Pc(26) Color local26 = new Color(Class273.anIntArray577[anInt7679]);
		@Pc(30) byte[] local30 = new byte[arg1.anInt7677];
		try {
			@Pc(78) InputStream local78;
			if (arg0) {
				@Pc(41) URL local41 = this.getCodeBase();
				@Pc(49) Socket local49 = new Socket(InetAddress.getByName(local41.getHost()), 443);
				local49.setSoTimeout(10000);
				@Pc(55) OutputStream local55 = local49.getOutputStream();
				local55.write(17);
				local55.write(("JAGGRAB " + local41.getFile() + arg1.aString77 + "\n\n").getBytes());
				local78 = local49.getInputStream();
			} else {
				local78 = (new URL(this.getCodeBase(), arg1.aString77)).openStream();
			}
			@Pc(91) int local91 = -1;
			@Pc(93) int local93 = 0;
			while (local30.length > local93) {
				@Pc(107) int local107 = local30.length - local93;
				if (local107 > 1000) {
					local107 = 1000;
				}
				@Pc(121) int local121 = local78.read(local30, local93, local107);
				if (local121 < 0) {
					throw new EOFException();
				}
				local93 += local121;
				@Pc(142) int local142 = local93 * 100 / local30.length;
				if (local91 != local142) {
					try {
						@Pc(149) Graphics local149 = this.getGraphics();
						if (local149 == null) {
							this.repaint();
						} else {
							local149.setColor(Color.black);
							local149.fillRect(0, 0, this.anInt7680, this.anInt7681);
							local149.setColor(local19);
							local149.drawRect(this.anInt7680 / 2 - 152, this.anInt7681 / 2 + -18, 303, 33);
							@Pc(202) String local202 = arg1.aStringArray48[this.anInt7678] + " - " + local142 + "%";
							local149.setFont(local8);
							local149.setColor(local26);
							local149.drawString(local202, (this.anInt7680 - local12.stringWidth(local202)) / 2, this.anInt7681 / 2 + 4);
							local91 = local142;
						}
					} catch (@Pc(230) Exception local230) {
					}
				}
			}
			local78.close();
			if (arg1.anInt7676 != arg1.anInt7677) {
				@Pc(247) byte[] local247 = new byte[arg1.anInt7676];
				@Pc(252) Inflater local252 = new Inflater(true);
				local252.setInput(local30);
				local30 = local247;
				local252.inflate(local247);
			}
		} catch (@Pc(263) Exception local263) {
			return null;
		}
		return this.method6096(false, local30, arg1) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;B)Z")
	private boolean method6095(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(10) FileOutputStream local10 = new FileOutputStream(arg1);
			local10.write(arg0, 0, arg0.length);
			local10.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method6093("savefile");
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

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean543 = true;
		this.aBoolean540 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString78 = this.getParameter("unsignedurl");
			if (aString78 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean541 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString78), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			aString79 = this.getParameter("crashurl");
			@Pc(38) int local38 = 0;
			@Pc(42) String local42 = this.getParameter("cachesubdirid");
			if (local42 != null) {
				local38 = Integer.parseInt(local42);
				if (local38 < 0 || local38 >= Class273.aStringArray47.length) {
					local38 = 0;
				}
			}
			@Pc(68) String local68 = this.getParameter("colourid");
			if (local68 != null) {
				anInt7679 = Integer.parseInt(local68);
				if (anInt7679 < 0 || anInt7679 >= Class273.anIntArray576.length) {
					anInt7679 = 0;
				}
			}
			this.anInt7680 = this.getSize().width;
			this.anInt7681 = this.getSize().height;
			@Pc(97) int local97 = 32;
			try {
				@Pc(102) int local102 = Integer.parseInt(this.getParameter("modewhat"));
				local97 += local102;
			} catch (@Pc(108) Exception local108) {
			}
			try {
				@Pc(112) String local112 = this.getParameter("lang");
				if (local112 != null) {
					this.anInt7678 = Integer.parseInt(local112);
				}
			} catch (@Pc(120) Exception local120) {
			}
			@Pc(130) Class280 local130;
			try {
				local130 = new Class280(this, local97, Class273.aStringArray47[local38], 30);
			} catch (@Pc(132) Exception local132) {
				this.method6093("nocache");
				return;
			}
			@Pc(139) unpack local139 = null;
			@Pc(149) byte[] local149;
			try {
				Class.forName("java.util.jar.Pack200");
				local149 = this.method6097(Class273.aClass277_2, false, local130);
				if (local149 == null) {
					return;
				}
				local139 = new unpack_Sub1(local149);
			} catch (@Pc(160) Throwable local160) {
			}
			if (local139 == null) {
				local149 = this.method6097(Class273.aClass277_1, false, local130);
				if (local149 == null) {
					return;
				}
				@Pc(179) unpack local179 = new unpack(local149);
				@Pc(184) ClassLoader_Sub1 local184 = new ClassLoader_Sub1(local179);
				@Pc(187) Class local187 = Class.forName("unpack");
				local184.method6092(local187.getName(), local187);
				@Pc(197) Class local197 = local184.loadClass("unpackclass");
				@Pc(204) byte[] local204 = this.method6097(Class273.aClass277_3, false, local130);
				if (local204 == null) {
					return;
				}
				local139 = (unpack) local197.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local204, Boolean.TRUE);
			}
			@Pc(240) ClassLoader_Sub1 local240 = new ClassLoader_Sub1(local139);
			@Pc(242) byte local242 = -1;
			@Pc(246) String local246 = System.getProperty("os.name").toLowerCase();
			@Pc(250) String local250 = System.getProperty("os.arch").toLowerCase();
			if (local246.startsWith("win")) {
				if (local250.startsWith("amd64") || local250.startsWith("x86_64")) {
					local242 = 1;
				} else {
					local242 = 0;
				}
			} else if (local246.startsWith("linux")) {
				if (local250.startsWith("amd64") || local250.startsWith("x86_64")) {
					local242 = 3;
				} else {
					local242 = 2;
				}
			} else if (local246.startsWith("mac")) {
				if (local250.startsWith("ppc")) {
					local242 = 4;
				} else if (local250.startsWith("x86_64")) {
					local242 = 6;
				} else {
					local242 = 7;
				}
			}
			if (local242 != -1) {
				this.method6097(Class273.aClass277Array1[local242], this.getParameter("suppress_sha") != null, local130);
			}
			if (Class273.aClass277Array2 != null) {
				local242 = -1;
				local246 = System.getProperty("os.name").toLowerCase();
				local250 = System.getProperty("os.arch").toLowerCase();
				if (local246.startsWith("win")) {
					if (local250.startsWith("amd64") || local250.startsWith("x86_64")) {
						local242 = 2;
					} else {
						local242 = 0;
					}
				}
				if (local242 != -1) {
					this.method6097(Class273.aClass277Array2[local242], this.getParameter("suppress_sha") != null, local130);
				}
			}
			if (Class273.aClass277Array3 != null) {
				local242 = -1;
				local246 = System.getProperty("os.name").toLowerCase();
				local250 = System.getProperty("os.arch").toLowerCase();
				if (local246.startsWith("win") && !local250.startsWith("amd64") && !local250.startsWith("x86_64")) {
					local242 = 0;
				}
				if (local242 != -1) {
					this.method6097(Class273.aClass277Array3[local242], this.getParameter("suppress_sha") != null, local130);
				}
			}
			@Pc(432) Class local432 = Class.forName("Class276");
			local240.method6092(local432.getName(), local432);
			@Pc(441) Class local441 = Class.forName("Class280");
			local240.method6092(local441.getName(), local441);
			@Pc(450) Class local450 = Class.forName("Class275");
			local240.method6092(local450.getName(), local450);
			@Pc(459) Class local459 = Class.forName("Class279");
			local240.method6092(local459.getName(), local459);
			@Pc(468) Class local468 = Class.forName("Interface14");
			local240.method6092(local468.getName(), local468);
			@Pc(478) Class local478 = local240.loadClass("client");
			synchronized (this) {
				if (this.aBoolean542) {
					return;
				}
				this.anApplet2 = (Applet) local478.getDeclaredConstructor().newInstance();
				local478.getMethod("providesignlink", local441).invoke(null, local130);
				this.anApplet2.init();
				if (this.aBoolean540) {
					this.anApplet2.start();
				}
				if (this.aBoolean543) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(538) Exception local538) {
			RuntimeException_Sub2.anInt7674 = 448998935;
			if (local538 instanceof InvocationTargetException) {
				@Pc(554) Throwable local554 = ((InvocationTargetException) local538).getTargetException();
				if (local554 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method6073(this, local554, local538.toString());
			} else {
				RuntimeException_Sub2.method6073(this, local538, null);
			}
			this.method6093("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean543 = false;
		this.aBoolean540 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean542 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Z[BBLloader!f;)Z")
	private boolean method6096(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class277 arg2) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg1);
			@Pc(21) byte[] local21 = local8.digest();
			for (@Pc(23) int local23 = 0; local23 < 20; local23++) {
				if (local21[local23] != arg2.anIntArray578[local23]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(46) Exception local46) {
			this.method6093("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!f;ZLloader!pc;B)[B")
	private byte[] method6097(@OriginalArg(0) Class277 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class280 arg2) {
		@Pc(11) File local11;
		try {
			local11 = arg2.method6106(arg0.aString76);
		} catch (@Pc(13) Exception local13) {
			this.method6093("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method6098(local11);
		if (!this.method6096(arg1, local24, arg0)) {
			local24 = this.method6094(false, arg0);
			if (local24 == null) {
				local24 = this.method6094(true, arg0);
			}
			if (local24 == null) {
				this.method6093("download");
				return null;
			}
			if (!this.method6095(local24, local11)) {
				return null;
			}
			local24 = this.method6098(local11);
			if (!this.method6096(false, local24, arg0)) {
				this.method6093("mismatch");
				return null;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method6098(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(8) int local8 = (int) arg0.length();
			@Pc(19) DataInputStream local19 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(22) byte[] local22 = new byte[local8];
			local19.readFully(local22, 0, local8);
			local19.close();
			return local22;
		} catch (@Pc(38) IOException local38) {
			return null;
		}
	}
}
