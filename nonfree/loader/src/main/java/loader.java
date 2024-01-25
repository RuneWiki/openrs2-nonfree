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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString79;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString80;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private static int anInt7794 = 0;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt7796;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt7797;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean521 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean522 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean523 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt7795 = 0;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean524 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method6318(@OriginalArg(1) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString80 = this.getParameter("unsignedurl");
			if (aString80 != null) {
				try {
					@Pc(11) SecurityManager local11 = System.getSecurityManager();
					if (local11 != null) {
						local11.checkExec("echo");
					}
				} catch (@Pc(19) SecurityException local19) {
					this.aBoolean522 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString80), "_parent");
					} catch (@Pc(32) Exception local32) {
					}
					return;
				}
			}
			aString79 = this.getParameter("crashurl");
			@Pc(39) int local39 = 0;
			@Pc(43) String local43 = this.getParameter("cachesubdirid");
			if (local43 != null) {
				local39 = Integer.parseInt(local43);
				if (local39 < 0 || Class276.aStringArray71.length <= local39) {
					local39 = 0;
				}
			}
			@Pc(68) String local68 = this.getParameter("colourid");
			if (local68 != null) {
				anInt7794 = Integer.parseInt(local68);
				if (anInt7794 < 0 || anInt7794 >= Class276.anIntArray640.length) {
					anInt7794 = 0;
				}
			}
			this.anInt7796 = this.getSize().width;
			this.anInt7797 = this.getSize().height;
			@Pc(97) int local97 = 32;
			try {
				@Pc(102) int local102 = Integer.parseInt(this.getParameter("modewhat"));
				local97 += local102;
			} catch (@Pc(108) Exception local108) {
			}
			try {
				@Pc(112) String local112 = this.getParameter("lang");
				if (local112 != null) {
					this.anInt7795 = Integer.parseInt(local112);
				}
			} catch (@Pc(121) Exception local121) {
			}
			@Pc(131) Class279 local131;
			try {
				local131 = new Class279(this, local97, Class276.aStringArray71[local39], 30);
			} catch (@Pc(133) Exception local133) {
				this.method6322("nocache");
				return;
			}
			@Pc(140) unpack local140 = null;
			@Pc(150) byte[] local150;
			try {
				Class.forName("java.util.jar.Pack200");
				local150 = this.method6319(Class276.aClass277_2, local131, false);
				if (local150 == null) {
					return;
				}
				local140 = new unpack_Sub1(local150);
			} catch (@Pc(160) Throwable local160) {
			}
			if (local140 == null) {
				local150 = this.method6319(Class276.aClass277_1, local131, false);
				if (local150 == null) {
					return;
				}
				@Pc(178) unpack local178 = new unpack(local150);
				@Pc(183) ClassLoader_Sub1 local183 = new ClassLoader_Sub1(local178);
				@Pc(186) Class local186 = Class.forName("unpack");
				local183.method6312(local186, local186.getName());
				@Pc(196) Class local196 = local183.loadClass("unpackclass");
				@Pc(203) byte[] local203 = this.method6319(Class276.aClass277_3, local131, false);
				if (local203 == null) {
					return;
				}
				local140 = (unpack) local196.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local203, Boolean.TRUE);
			}
			@Pc(238) ClassLoader_Sub1 local238 = new ClassLoader_Sub1(local140);
			@Pc(240) byte local240 = -1;
			@Pc(244) String local244 = System.getProperty("os.name").toLowerCase();
			@Pc(248) String local248 = System.getProperty("os.arch").toLowerCase();
			if (local244.startsWith("win")) {
				if (local248.startsWith("amd64") || local248.startsWith("x86_64")) {
					local240 = 1;
				} else {
					local240 = 0;
				}
			} else if (local244.startsWith("linux")) {
				if (local248.startsWith("amd64") || local248.startsWith("x86_64")) {
					local240 = 3;
				} else {
					local240 = 2;
				}
			} else if (local244.startsWith("mac")) {
				if (local248.startsWith("ppc")) {
					local240 = 4;
				} else if (local248.startsWith("x86_64")) {
					local240 = 6;
				} else {
					local240 = 7;
				}
			}
			if (local240 != -1) {
				this.method6319(Class276.aClass277Array1[local240], local131, this.getParameter("suppress_sha") != null);
			}
			if (Class276.aClass277Array2 != null) {
				local240 = -1;
				local244 = System.getProperty("os.name").toLowerCase();
				local248 = System.getProperty("os.arch").toLowerCase();
				if (local244.startsWith("win")) {
					if (local248.startsWith("amd64") || local248.startsWith("x86_64")) {
						local240 = 2;
					} else {
						local240 = 0;
					}
				}
				if (local240 != -1) {
					this.method6319(Class276.aClass277Array2[local240], local131, this.getParameter("suppress_sha") != null);
				}
			}
			if (Class276.aClass277Array3 != null) {
				local240 = -1;
				local244 = System.getProperty("os.name").toLowerCase();
				local248 = System.getProperty("os.arch").toLowerCase();
				if (local244.startsWith("win") && !local248.startsWith("amd64") && !local248.startsWith("x86_64")) {
					local240 = 0;
				}
				if (local240 != -1) {
					this.method6319(Class276.aClass277Array3[local240], local131, this.getParameter("suppress_sha") != null);
				}
			}
			@Pc(434) Class local434 = Class.forName("Class280");
			local238.method6312(local434, local434.getName());
			@Pc(443) Class local443 = Class.forName("Class279");
			local238.method6312(local443, local443.getName());
			@Pc(452) Class local452 = Class.forName("Class278");
			local238.method6312(local452, local452.getName());
			@Pc(461) Class local461 = Class.forName("Class281");
			local238.method6312(local461, local461.getName());
			@Pc(470) Class local470 = Class.forName("Interface15");
			local238.method6312(local470, local470.getName());
			@Pc(480) Class local480 = local238.loadClass("client");
			synchronized (this) {
				if (this.aBoolean524) {
					return;
				}
				this.anApplet2 = (Applet) local480.getDeclaredConstructor().newInstance();
				local480.getMethod("providesignlink", local443).invoke(null, local131);
				this.anApplet2.init();
				if (this.aBoolean521) {
					this.anApplet2.start();
				}
				if (this.aBoolean523) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(541) Exception local541) {
			RuntimeException_Sub2.anInt7786 = 296346917;
			if (local541 instanceof InvocationTargetException) {
				@Pc(557) Throwable local557 = ((InvocationTargetException) local541).getTargetException();
				if (local557 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method6313(this, local541.toString(), local557);
			} else {
				RuntimeException_Sub2.method6313(this, null, local541);
			}
			this.method6322("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!g;Lloader!pb;BZ)[B")
	private byte[] method6319(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class279 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) File local10;
		try {
			local10 = arg1.method6336(arg0.aString77);
		} catch (@Pc(12) Exception local12) {
			this.method6322("nocache");
			return null;
		}
		@Pc(25) byte[] local25 = this.method6318(local10);
		if (!this.method6321(arg2, arg0, local25)) {
			local25 = this.method6323(false, arg0);
			if (local25 == null) {
				local25 = this.method6323(true, arg0);
			}
			if (local25 == null) {
				this.method6322("download");
				return null;
			}
			if (!this.method6320(local25, local10)) {
				return null;
			}
			local25 = this.method6318(local10);
			if (!this.method6321(false, arg0, local25)) {
				this.method6322("mismatch");
				return null;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean523 = false;
		this.aBoolean521 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
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
		this.aBoolean524 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BILjava/io/File;)Z")
	private boolean method6320(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(12) FileOutputStream local12 = new FileOutputStream(arg1);
			local12.write(arg0, 0, arg0.length);
			local12.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			this.method6322("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean521 = this.aBoolean523 = false;
		this.aBoolean524 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!g;I[B)Z")
	private boolean method6321(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(3) byte[] arg2) {
		try {
			if (arg2 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg2);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(24) int local24 = 0; local24 < 20; local24++) {
				if (local17[local24] != arg1.anIntArray641[local24]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(47) Exception local47) {
			this.method6322("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method6322(@OriginalArg(0) String arg0) {
		if (this.aBoolean522) {
			return;
		}
		this.aBoolean522 = true;
		try {
			if (aString79 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString79 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZILloader!g;)[B")
	private byte[] method6323(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class277 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class276.anIntArray640[anInt7794]);
		@Pc(26) Color local26 = new Color(Class276.anIntArray639[anInt7794]);
		@Pc(30) byte[] local30 = new byte[arg1.anInt7788];
		try {
			@Pc(72) InputStream local72;
			if (arg0) {
				@Pc(35) URL local35 = this.getCodeBase();
				@Pc(43) Socket local43 = new Socket(InetAddress.getByName(local35.getHost()), 443);
				local43.setSoTimeout(10000);
				@Pc(49) OutputStream local49 = local43.getOutputStream();
				local49.write(17);
				local49.write(("JAGGRAB " + local35.getFile() + arg1.aString78 + "\n\n").getBytes());
				local72 = local43.getInputStream();
			} else {
				local72 = (new URL(this.getCodeBase(), arg1.aString78)).openStream();
			}
			@Pc(85) int local85 = -1;
			@Pc(87) int local87 = 0;
			while (local87 < local30.length) {
				@Pc(101) int local101 = local30.length - local87;
				if (local101 > 1000) {
					local101 = 1000;
				}
				@Pc(115) int local115 = local72.read(local30, local87, local101);
				if (local115 < 0) {
					throw new EOFException();
				}
				local87 += local115;
				@Pc(133) int local133 = local87 * 100 / local30.length;
				if (local133 != local85) {
					try {
						@Pc(144) Graphics local144 = this.getGraphics();
						if (local144 == null) {
							this.repaint();
						} else {
							local144.setColor(Color.black);
							local144.fillRect(0, 0, this.anInt7796, this.anInt7797);
							local144.setColor(local19);
							local144.drawRect(this.anInt7796 / 2 - 152, this.anInt7797 / 2 + -18, 303, 33);
							@Pc(193) String local193 = arg1.aStringArray72[this.anInt7795] + " - " + local133 + "%";
							local144.setFont(local8);
							local144.setColor(local26);
							local144.drawString(local193, (this.anInt7796 - local12.stringWidth(local193)) / 2, this.anInt7797 / 2 + 4);
							local85 = local133;
						}
					} catch (@Pc(225) Exception local225) {
					}
				}
			}
			local72.close();
			if (arg1.anInt7789 != arg1.anInt7788) {
				@Pc(242) byte[] local242 = new byte[arg1.anInt7789];
				@Pc(247) Inflater local247 = new Inflater(true);
				local247.setInput(local30);
				local247.inflate(local242);
				local30 = local242;
			}
		} catch (@Pc(258) Exception local258) {
			return null;
		}
		return this.method6321(false, arg1, local30) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean521 = false;
		this.aBoolean523 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}
}
