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

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString96;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString97;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private static int anInt9190 = 0;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt9189;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt9191;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean674 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean675 = false;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt9188 = 0;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean676 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean677 = false;

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean677 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!ae;Lloader!e;I)[B")
	private byte[] method7512(@OriginalArg(0) Class321 arg0, @OriginalArg(1) Class323 arg1) {
		@Pc(5) File local5;
		try {
			local5 = arg0.method7461(arg1.aString95);
		} catch (@Pc(13) Exception local13) {
			this.method7517("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method7515(local5);
		if (!this.method7513(arg1, local24)) {
			local24 = this.method7514(arg1, false);
			if (local24 == null) {
				local24 = this.method7514(arg1, true);
			}
			if (local24 == null) {
				this.method7517("download");
				return null;
			}
			if (!this.method7516(local5, local24)) {
				return null;
			}
			local24 = this.method7515(local5);
			if (!this.method7513(arg1, local24)) {
				this.method7517("mismatch");
				return null;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!e;B[B)Z")
	private boolean method7513(@OriginalArg(0) Class323 arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(16) MessageDigest local16 = MessageDigest.getInstance("SHA");
			local16.reset();
			local16.update(arg1);
			@Pc(24) byte[] local24 = local16.digest();
			for (@Pc(26) int local26 = 0; local26 < 20; local26++) {
				if (local24[local26] != arg0.anIntArray732[local26]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(47) Exception local47) {
			this.method7517("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!e;ZI)[B")
	private byte[] method7514(@OriginalArg(0) Class323 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class328.anIntArray734[anInt9190]);
		@Pc(26) Color local26 = new Color(Class328.anIntArray733[anInt9190]);
		@Pc(30) byte[] local30 = new byte[arg0.anInt9183];
		try {
			@Pc(41) InputStream local41;
			if (arg1) {
				@Pc(46) URL local46 = this.getCodeBase();
				@Pc(54) Socket local54 = new Socket(InetAddress.getByName(local46.getHost()), 443);
				local54.setSoTimeout(10000);
				@Pc(60) OutputStream local60 = local54.getOutputStream();
				local60.write(17);
				local60.write(("JAGGRAB " + local46.getFile() + arg0.aString94 + "\n\n").getBytes());
				local41 = local54.getInputStream();
			} else {
				local41 = (new URL(this.getCodeBase(), arg0.aString94)).openStream();
			}
			@Pc(85) int local85 = -1;
			@Pc(87) int local87 = 0;
			while (local30.length > local87) {
				@Pc(100) int local100 = local30.length - local87;
				if (local100 > 1000) {
					local100 = 1000;
				}
				@Pc(114) int local114 = local41.read(local30, local87, local100);
				if (local114 < 0) {
					throw new EOFException();
				}
				local87 += local114;
				@Pc(135) int local135 = local87 * 100 / local30.length;
				if (local135 != local85) {
					try {
						@Pc(145) Graphics local145 = this.getGraphics();
						if (local145 == null) {
							this.repaint();
						} else {
							local145.setColor(Color.black);
							local145.fillRect(0, 0, this.anInt9189, this.anInt9191);
							local145.setColor(local19);
							local145.drawRect(this.anInt9189 / 2 - 152, this.anInt9191 / 2 - 18, 303, 33);
							@Pc(194) String local194 = arg0.aStringArray40[this.anInt9188] + " - " + local135 + "%";
							local145.setFont(local8);
							local145.setColor(local26);
							local145.drawString(local194, (this.anInt9189 - local12.stringWidth(local194)) / 2, this.anInt9191 / 2 + 4);
							local85 = local135;
						}
					} catch (@Pc(226) Exception local226) {
					}
				}
			}
			local41.close();
			if (arg0.anInt9183 != arg0.anInt9182) {
				@Pc(243) byte[] local243 = new byte[arg0.anInt9182];
				@Pc(248) Inflater local248 = new Inflater(true);
				local248.setInput(local30);
				local30 = local243;
				local248.inflate(local243);
			}
		} catch (@Pc(259) Exception local259) {
			return null;
		}
		return this.method7513(arg0, local30) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method7515(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(17) int local17 = (int) arg0.length();
			@Pc(28) DataInputStream local28 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(31) byte[] local31 = new byte[local17];
			local28.readFully(local31, 0, local17);
			local28.close();
			return local31;
		} catch (@Pc(41) IOException local41) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	private boolean method7516(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg0);
			local9.write(arg1, 0, arg1.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method7517("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method7517(@OriginalArg(0) String arg0) {
		if (this.aBoolean675) {
			return;
		}
		this.aBoolean675 = true;
		try {
			if (aString96 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString96 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean677 = true;
		this.aBoolean674 = this.aBoolean676 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean676 = true;
		this.aBoolean674 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean676 = false;
		this.aBoolean674 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString97 = this.getParameter("unsignedurl");
			if (aString97 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean675 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString97), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			aString96 = this.getParameter("crashurl");
			@Pc(38) int local38 = 0;
			@Pc(42) String local42 = this.getParameter("cachesubdirid");
			if (local42 != null) {
				local38 = Integer.parseInt(local42);
				if (local38 < 0 || Class328.aStringArray41.length <= local38) {
					local38 = 0;
				}
			}
			@Pc(69) String local69 = this.getParameter("colourid");
			if (local69 != null) {
				anInt9190 = Integer.parseInt(local69);
				if (anInt9190 < 0 || Class328.anIntArray734.length <= anInt9190) {
					anInt9190 = 0;
				}
			}
			this.anInt9189 = this.getSize().width;
			this.anInt9191 = this.getSize().height;
			@Pc(100) int local100 = 32;
			try {
				@Pc(105) int local105 = Integer.parseInt(this.getParameter("modewhat"));
				local100 += local105;
			} catch (@Pc(111) Exception local111) {
			}
			try {
				@Pc(115) String local115 = this.getParameter("lang");
				if (local115 != null) {
					this.anInt9188 = Integer.parseInt(local115);
				}
			} catch (@Pc(123) Exception local123) {
			}
			@Pc(133) Class321 local133;
			try {
				local133 = new Class321(this, local100, Class328.aStringArray41[local38], 32);
			} catch (@Pc(135) Exception local135) {
				this.method7517("nocache");
				return;
			}
			@Pc(142) unpack local142 = null;
			@Pc(151) byte[] local151;
			try {
				Class.forName("java.util.jar.Pack200");
				local151 = this.method7512(local133, Class328.aClass323_2);
				if (local151 == null) {
					return;
				}
				local142 = new unpack_Sub1(local151);
			} catch (@Pc(162) Throwable local162) {
			}
			if (local142 == null) {
				local151 = this.method7512(local133, Class328.aClass323_1);
				if (local151 == null) {
					return;
				}
				@Pc(179) unpack local179 = new unpack(local151);
				@Pc(184) ClassLoader_Sub1 local184 = new ClassLoader_Sub1(local179);
				@Pc(187) Class local187 = Class.forName("unpack");
				local184.method7498(local187.getName(), local187);
				@Pc(197) Class local197 = local184.loadClass("unpackclass");
				@Pc(203) byte[] local203 = this.method7512(local133, Class328.aClass323_3);
				if (local203 == null) {
					return;
				}
				local142 = (unpack) local197.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local203, Boolean.TRUE);
			}
			@Pc(238) ClassLoader_Sub1 local238 = new ClassLoader_Sub1(local142);
			@Pc(241) Class local241 = Class.forName("Class327");
			local238.method7498(local241.getName(), local241);
			@Pc(250) Class local250 = Class.forName("Class321");
			local238.method7498(local250.getName(), local250);
			@Pc(259) Class local259 = Class.forName("Class325");
			local238.method7498(local259.getName(), local259);
			@Pc(268) Class local268 = Class.forName("Class324");
			local238.method7498(local268.getName(), local268);
			@Pc(277) Class local277 = Class.forName("Interface22");
			local238.method7498(local277.getName(), local277);
			@Pc(287) Class local287 = local238.loadClass("client");
			synchronized (this) {
				if (this.aBoolean677) {
					return;
				}
				this.anApplet3 = (Applet) local287.getDeclaredConstructor().newInstance();
				local287.getMethod("providesignlink", local250).invoke(null, local133);
				this.anApplet3.init();
				if (this.aBoolean674) {
					this.anApplet3.start();
				}
				if (this.aBoolean676) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(346) Exception local346) {
			RuntimeException_Sub2.anInt9180 = 162331380;
			if (local346 instanceof InvocationTargetException) {
				@Pc(362) Throwable local362 = ((InvocationTargetException) local346).getTargetException();
				if (local362 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method7495(this, local362, local346.toString());
			} else {
				RuntimeException_Sub2.method7495(this, local346, null);
			}
			this.method7517("crash");
		}
	}
}
