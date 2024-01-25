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

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString78;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString79;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private static int anInt7701 = 0;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt7700;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt7702;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt7699 = 0;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean532 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean531 = false;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean530 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean533 = false;

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean533 = false;
		this.aBoolean531 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method6131(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(20) DataInputStream local20 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(23) byte[] local23 = new byte[local9];
			local20.readFully(local23, 0, local9);
			local20.close();
			return local23;
		} catch (@Pc(40) IOException local40) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZBLloader!a;[B)Z")
	private boolean method6132(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class270 arg1, @OriginalArg(3) byte[] arg2) {
		try {
			if (arg2 == null) {
				return false;
			}
			@Pc(16) MessageDigest local16 = MessageDigest.getInstance("SHA");
			local16.reset();
			local16.update(arg2);
			@Pc(24) byte[] local24 = local16.digest();
			for (@Pc(26) int local26 = 0; local26 < 20; local26++) {
				if (arg1.anIntArray588[local26] != local24[local26]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(45) Exception local45) {
			this.method6134("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean532 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZZLloader!a;)[B")
	private byte[] method6133(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class270 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class273.anIntArray590[anInt7701]);
		@Pc(26) Color local26 = new Color(Class273.anIntArray589[anInt7701]);
		@Pc(30) byte[] local30 = new byte[arg1.anInt7693];
		try {
			@Pc(72) InputStream local72;
			if (arg0) {
				@Pc(35) URL local35 = this.getCodeBase();
				@Pc(43) Socket local43 = new Socket(InetAddress.getByName(local35.getHost()), 443);
				local43.setSoTimeout(10000);
				@Pc(49) OutputStream local49 = local43.getOutputStream();
				local49.write(17);
				local49.write(("JAGGRAB " + local35.getFile() + arg1.aString67 + "\n\n").getBytes());
				local72 = local43.getInputStream();
			} else {
				local72 = (new URL(this.getCodeBase(), arg1.aString67)).openStream();
			}
			@Pc(85) int local85 = -1;
			@Pc(87) int local87 = 0;
			while (local87 < local30.length) {
				@Pc(100) int local100 = local30.length - local87;
				if (local100 > 1000) {
					local100 = 1000;
				}
				@Pc(112) int local112 = local72.read(local30, local87, local100);
				if (local112 < 0) {
					throw new EOFException();
				}
				local87 += local112;
				@Pc(130) int local130 = local87 * 100 / local30.length;
				if (local85 != local130) {
					try {
						@Pc(141) Graphics local141 = this.getGraphics();
						if (local141 == null) {
							this.repaint();
						} else {
							local141.setColor(Color.black);
							local141.fillRect(0, 0, this.anInt7702, this.anInt7700);
							local141.setColor(local19);
							local141.drawRect(this.anInt7702 / 2 - 152, this.anInt7700 / 2 + -18, 303, 33);
							@Pc(195) String local195 = arg1.aStringArray178[this.anInt7699] + " - " + local130 + "%";
							local141.setFont(local8);
							local141.setColor(local26);
							local141.drawString(local195, (this.anInt7702 - local12.stringWidth(local195)) / 2, this.anInt7700 / 2 + 4);
							local85 = local130;
						}
					} catch (@Pc(223) Exception local223) {
					}
				}
			}
			local72.close();
			if (arg1.anInt7693 != arg1.anInt7694) {
				@Pc(240) byte[] local240 = new byte[arg1.anInt7694];
				@Pc(245) Inflater local245 = new Inflater(true);
				local245.setInput(local30);
				local245.inflate(local240);
				local30 = local240;
			}
		} catch (@Pc(266) Exception local266) {
			return null;
		}
		return this.method6132(false, arg1, local30) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method6134(@OriginalArg(0) String arg0) {
		if (this.aBoolean530) {
			return;
		}
		this.aBoolean530 = true;
		try {
			if (aString78 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString78 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	private boolean method6135(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(14) FileOutputStream local14 = new FileOutputStream(arg0);
			local14.write(arg1, 0, arg1.length);
			local14.close();
			return true;
		} catch (@Pc(25) IOException local25) {
			this.method6134("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean531 = false;
		this.aBoolean533 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!a;Lloader!hs;IZ)[B")
	private byte[] method6136(@OriginalArg(0) Class270 arg0, @OriginalArg(1) Class275 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg1.method6111(arg0.aString68);
		} catch (@Pc(12) Exception local12) {
			this.method6134("nocache");
			return null;
		}
		@Pc(23) byte[] local23 = this.method6131(local5);
		if (!this.method6132(arg2, arg0, local23)) {
			local23 = this.method6133(false, arg0);
			if (local23 == null) {
				local23 = this.method6133(true, arg0);
			}
			if (local23 == null) {
				this.method6134("download");
				return null;
			}
			if (!this.method6135(local5, local23)) {
				return null;
			}
			local23 = this.method6131(local5);
			if (!this.method6132(false, arg0, local23)) {
				this.method6134("mismatch");
				return null;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString79 = this.getParameter("unsignedurl");
			if (aString79 != null) {
				try {
					@Pc(11) SecurityManager local11 = System.getSecurityManager();
					if (local11 != null) {
						local11.checkExec("echo");
					}
				} catch (@Pc(19) SecurityException local19) {
					this.aBoolean530 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString79), "_parent");
					} catch (@Pc(32) Exception local32) {
					}
					return;
				}
			}
			aString78 = this.getParameter("crashurl");
			@Pc(39) int local39 = 0;
			@Pc(43) String local43 = this.getParameter("cachesubdirid");
			if (local43 != null) {
				local39 = Integer.parseInt(local43);
				if (local39 < 0 || Class273.aStringArray179.length <= local39) {
					local39 = 0;
				}
			}
			@Pc(68) String local68 = this.getParameter("colourid");
			if (local68 != null) {
				anInt7701 = Integer.parseInt(local68);
				if (anInt7701 < 0 || anInt7701 >= Class273.anIntArray590.length) {
					anInt7701 = 0;
				}
			}
			this.anInt7702 = this.getSize().width;
			this.anInt7700 = this.getSize().height;
			@Pc(101) int local101 = 32;
			try {
				@Pc(106) int local106 = Integer.parseInt(this.getParameter("modewhat"));
				local101 += local106;
			} catch (@Pc(112) Exception local112) {
			}
			try {
				@Pc(116) String local116 = this.getParameter("lang");
				if (local116 != null) {
					this.anInt7699 = Integer.parseInt(local116);
				}
			} catch (@Pc(126) Exception local126) {
			}
			@Pc(136) Class275 local136;
			try {
				local136 = new Class275(this, local101, Class273.aStringArray179[local39], 30);
			} catch (@Pc(138) Exception local138) {
				this.method6134("nocache");
				return;
			}
			@Pc(145) unpack local145 = null;
			@Pc(155) byte[] local155;
			try {
				Class.forName("java.util.jar.Pack200");
				local155 = this.method6136(Class273.aClass270_2, local136, false);
				if (local155 == null) {
					return;
				}
				local145 = new unpack_Sub1(local155);
			} catch (@Pc(166) Throwable local166) {
			}
			if (local145 == null) {
				local155 = this.method6136(Class273.aClass270_1, local136, false);
				if (local155 == null) {
					return;
				}
				@Pc(184) unpack local184 = new unpack(local155);
				@Pc(189) ClassLoader_Sub1 local189 = new ClassLoader_Sub1(local184);
				@Pc(192) Class local192 = Class.forName("unpack");
				local189.method6088(local192, local192.getName());
				@Pc(202) Class local202 = local189.loadClass("unpackclass");
				@Pc(209) byte[] local209 = this.method6136(Class273.aClass270_3, local136, false);
				if (local209 == null) {
					return;
				}
				local145 = (unpack) local202.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local209, Boolean.TRUE);
			}
			@Pc(243) ClassLoader_Sub1 local243 = new ClassLoader_Sub1(local145);
			@Pc(245) byte local245 = -1;
			@Pc(249) String local249 = System.getProperty("os.name").toLowerCase();
			@Pc(253) String local253 = System.getProperty("os.arch").toLowerCase();
			if (local249.startsWith("win")) {
				if (local253.startsWith("amd64") || local253.startsWith("x86_64")) {
					local245 = 1;
				} else {
					local245 = 0;
				}
			} else if (local249.startsWith("linux")) {
				if (local253.startsWith("amd64") || local253.startsWith("x86_64")) {
					local245 = 3;
				} else {
					local245 = 2;
				}
			} else if (local249.startsWith("mac")) {
				if (local253.startsWith("ppc")) {
					local245 = 4;
				} else if (local253.startsWith("x86_64")) {
					local245 = 6;
				} else {
					local245 = 7;
				}
			}
			if (local245 != -1) {
				this.method6136(Class273.aClass270Array1[local245], local136, this.getParameter("suppress_sha") != null);
			}
			if (Class273.aClass270Array2 != null) {
				local245 = -1;
				local249 = System.getProperty("os.name").toLowerCase();
				local253 = System.getProperty("os.arch").toLowerCase();
				if (local249.startsWith("win")) {
					if (local253.startsWith("amd64") || local253.startsWith("x86_64")) {
						local245 = 2;
					} else {
						local245 = 0;
					}
				}
				if (local245 != -1) {
					this.method6136(Class273.aClass270Array2[local245], local136, this.getParameter("suppress_sha") != null);
				}
			}
			if (Class273.aClass270Array3 != null) {
				local245 = -1;
				local249 = System.getProperty("os.name").toLowerCase();
				local253 = System.getProperty("os.arch").toLowerCase();
				if (local249.startsWith("win") && !local253.startsWith("amd64") && !local253.startsWith("x86_64")) {
					local245 = 0;
				}
				if (local245 != -1) {
					this.method6136(Class273.aClass270Array3[local245], local136, this.getParameter("suppress_sha") != null);
				}
			}
			@Pc(436) Class local436 = Class.forName("Class277");
			local243.method6088(local436, local436.getName());
			@Pc(445) Class local445 = Class.forName("Class275");
			local243.method6088(local445, local445.getName());
			@Pc(454) Class local454 = Class.forName("Class276");
			local243.method6088(local454, local454.getName());
			@Pc(463) Class local463 = Class.forName("Class274");
			local243.method6088(local463, local463.getName());
			@Pc(472) Class local472 = Class.forName("Interface14");
			local243.method6088(local472, local472.getName());
			@Pc(482) Class local482 = local243.loadClass("client");
			synchronized (this) {
				if (this.aBoolean532) {
					return;
				}
				this.anApplet3 = (Applet) local482.getDeclaredConstructor().newInstance();
				local482.getMethod("providesignlink", local445).invoke(null, local136);
				this.anApplet3.init();
				if (this.aBoolean533) {
					this.anApplet3.start();
				}
				if (this.aBoolean531) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(541) Exception local541) {
			RuntimeException_Sub2.anInt7695 = -1864659251;
			if (local541 instanceof InvocationTargetException) {
				@Pc(557) Throwable local557 = ((InvocationTargetException) local541).getTargetException();
				if (local557 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method6096(local541.toString(), local557, this);
			} else {
				RuntimeException_Sub2.method6096(null, local541, this);
			}
			this.method6134("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean532 = true;
		this.aBoolean533 = this.aBoolean531 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}
}
