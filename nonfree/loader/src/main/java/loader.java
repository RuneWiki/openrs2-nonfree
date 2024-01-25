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
	private static String aString80;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString81;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private static int anInt7689 = 0;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt7691;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt7692;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt7690 = 0;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean663 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean664 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean662 = false;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean661 = false;

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!g;IZ)[B")
	private byte[] method6054(@OriginalArg(0) Class275 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class273.anIntArray536[anInt7689]);
		@Pc(26) Color local26 = new Color(Class273.anIntArray537[anInt7689]);
		@Pc(30) byte[] local30 = new byte[arg0.anInt7685];
		try {
			@Pc(72) InputStream local72;
			if (arg1) {
				@Pc(35) URL local35 = this.getCodeBase();
				@Pc(43) Socket local43 = new Socket(InetAddress.getByName(local35.getHost()), 443);
				local43.setSoTimeout(10000);
				@Pc(49) OutputStream local49 = local43.getOutputStream();
				local49.write(17);
				local49.write(("JAGGRAB " + local35.getFile() + arg0.aString70 + "\n\n").getBytes());
				local72 = local43.getInputStream();
			} else {
				local72 = (new URL(this.getCodeBase(), arg0.aString70)).openStream();
			}
			@Pc(85) int local85 = -1;
			@Pc(87) int local87 = 0;
			while (local30.length > local87) {
				@Pc(101) int local101 = local30.length - local87;
				if (local101 > 1000) {
					local101 = 1000;
				}
				@Pc(115) int local115 = local72.read(local30, local87, local101);
				if (local115 < 0) {
					throw new EOFException();
				}
				local87 += local115;
				@Pc(135) int local135 = local87 * 100 / local30.length;
				if (local135 != local85) {
					try {
						@Pc(146) Graphics local146 = this.getGraphics();
						if (local146 == null) {
							this.repaint();
						} else {
							local146.setColor(Color.black);
							local146.fillRect(0, 0, this.anInt7691, this.anInt7692);
							local146.setColor(local19);
							local146.drawRect(this.anInt7691 / 2 - 152, this.anInt7692 / 2 - 18, 303, 33);
							@Pc(199) String local199 = arg0.aStringArray53[this.anInt7690] + " - " + local135 + "%";
							local146.setFont(local8);
							local146.setColor(local26);
							local85 = local135;
							local146.drawString(local199, (this.anInt7691 - local12.stringWidth(local199)) / 2, this.anInt7692 / 2 + 4);
						}
					} catch (@Pc(227) Exception local227) {
					}
				}
			}
			local72.close();
			if (arg0.anInt7686 != arg0.anInt7685) {
				@Pc(245) byte[] local245 = new byte[arg0.anInt7686];
				@Pc(250) Inflater local250 = new Inflater(true);
				local250.setInput(local30);
				local250.inflate(local245);
				local30 = local245;
			}
		} catch (@Pc(261) Exception local261) {
			return null;
		}
		return this.method6057(arg0, local30, false) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B[BLjava/io/File;)Z")
	private boolean method6055(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method6058("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!li;Lloader!g;Z)[B")
	private byte[] method6056(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class276 arg1, @OriginalArg(2) Class275 arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg1.method6039(arg2.aString71);
		} catch (@Pc(7) Exception local7) {
			this.method6058("nocache");
			return null;
		}
		@Pc(18) byte[] local18 = this.method6059(local5);
		if (!this.method6057(arg2, local18, arg0)) {
			local18 = this.method6054(arg2, false);
			if (local18 == null) {
				local18 = this.method6054(arg2, true);
			}
			if (local18 == null) {
				this.method6058("download");
				return null;
			}
			if (!this.method6055(local18, local5)) {
				return null;
			}
			local18 = this.method6059(local5);
			if (!this.method6057(arg2, local18, false)) {
				this.method6058("mismatch");
				return null;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean664 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!g;[BZZ)Z")
	private boolean method6057(@OriginalArg(0) Class275 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg1);
			@Pc(23) byte[] local23 = local10.digest();
			for (@Pc(25) int local25 = 0; local25 < 20; local25++) {
				if (arg0.anIntArray538[local25] != local23[local25]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(49) Exception local49) {
			this.method6058("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method6058(@OriginalArg(1) String arg0) {
		if (this.aBoolean663) {
			return;
		}
		this.aBoolean663 = true;
		try {
			if (aString80 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString80 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString81 = this.getParameter("unsignedurl");
			if (aString81 != null) {
				try {
					@Pc(11) SecurityManager local11 = System.getSecurityManager();
					if (local11 != null) {
						local11.checkExec("echo");
					}
				} catch (@Pc(19) SecurityException local19) {
					this.aBoolean663 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString81), "_parent");
					} catch (@Pc(32) Exception local32) {
					}
					return;
				}
			}
			aString80 = this.getParameter("crashurl");
			@Pc(39) int local39 = 0;
			@Pc(43) String local43 = this.getParameter("cachesubdirid");
			if (local43 != null) {
				local39 = Integer.parseInt(local43);
				if (local39 < 0 || Class273.aStringArray52.length <= local39) {
					local39 = 0;
				}
			}
			@Pc(67) String local67 = this.getParameter("colourid");
			if (local67 != null) {
				anInt7689 = Integer.parseInt(local67);
				if (anInt7689 < 0 || Class273.anIntArray536.length <= anInt7689) {
					anInt7689 = 0;
				}
			}
			this.anInt7691 = this.getSize().width;
			this.anInt7692 = this.getSize().height;
			@Pc(95) int local95 = 32;
			try {
				@Pc(100) int local100 = Integer.parseInt(this.getParameter("modewhat"));
				local95 += local100;
			} catch (@Pc(106) Exception local106) {
			}
			try {
				@Pc(110) String local110 = this.getParameter("lang");
				if (local110 != null) {
					this.anInt7690 = Integer.parseInt(local110);
				}
			} catch (@Pc(118) Exception local118) {
			}
			@Pc(128) Class276 local128;
			try {
				local128 = new Class276(this, local95, Class273.aStringArray52[local39], 30);
			} catch (@Pc(130) Exception local130) {
				this.method6058("nocache");
				return;
			}
			@Pc(137) unpack local137 = null;
			@Pc(147) byte[] local147;
			try {
				Class.forName("java.util.jar.Pack200");
				local147 = this.method6056(false, local128, Class273.aClass275_2);
				if (local147 == null) {
					return;
				}
				local137 = new unpack_Sub1(local147);
			} catch (@Pc(158) Throwable local158) {
			}
			if (local137 == null) {
				local147 = this.method6056(false, local128, Class273.aClass275_1);
				if (local147 == null) {
					return;
				}
				@Pc(178) unpack local178 = new unpack(local147);
				@Pc(183) ClassLoader_Sub1 local183 = new ClassLoader_Sub1(local178);
				@Pc(186) Class local186 = Class.forName("unpack");
				local183.method6019(local186.getName(), local186);
				@Pc(196) Class local196 = local183.loadClass("unpackclass");
				@Pc(203) byte[] local203 = this.method6056(false, local128, Class273.aClass275_3);
				if (local203 == null) {
					return;
				}
				local137 = (unpack) local196.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local203, Boolean.TRUE);
			}
			@Pc(239) ClassLoader_Sub1 local239 = new ClassLoader_Sub1(local137);
			@Pc(241) byte local241 = -1;
			@Pc(245) String local245 = System.getProperty("os.name").toLowerCase();
			@Pc(249) String local249 = System.getProperty("os.arch").toLowerCase();
			if (local245.startsWith("win")) {
				if (local249.startsWith("amd64") || local249.startsWith("x86_64")) {
					local241 = 1;
				} else {
					local241 = 0;
				}
			} else if (local245.startsWith("linux")) {
				if (local249.startsWith("amd64") || local249.startsWith("x86_64")) {
					local241 = 3;
				} else {
					local241 = 2;
				}
			} else if (local245.startsWith("mac")) {
				if (local249.startsWith("ppc")) {
					local241 = 4;
				} else if (local249.startsWith("x86_64")) {
					local241 = 6;
				} else {
					local241 = 7;
				}
			}
			if (local241 != -1) {
				this.method6056(this.getParameter("suppress_sha") != null, local128, Class273.aClass275Array1[local241]);
			}
			if (Class273.aClass275Array2 != null) {
				local241 = -1;
				local245 = System.getProperty("os.name").toLowerCase();
				local249 = System.getProperty("os.arch").toLowerCase();
				if (local245.startsWith("win")) {
					if (local249.startsWith("amd64") || local249.startsWith("x86_64")) {
						local241 = 2;
					} else {
						local241 = 0;
					}
				}
				if (local241 != -1) {
					this.method6056(this.getParameter("suppress_sha") != null, local128, Class273.aClass275Array2[local241]);
				}
			}
			if (Class273.aClass275Array3 != null) {
				local241 = -1;
				local245 = System.getProperty("os.name").toLowerCase();
				local249 = System.getProperty("os.arch").toLowerCase();
				if (local245.startsWith("win") && !local249.startsWith("amd64") && !local249.startsWith("x86_64")) {
					local241 = 0;
				}
				if (local241 != -1) {
					this.method6056(this.getParameter("suppress_sha") != null, local128, Class273.aClass275Array3[local241]);
				}
			}
			@Pc(434) Class local434 = Class.forName("Class277");
			local239.method6019(local434.getName(), local434);
			@Pc(443) Class local443 = Class.forName("Class276");
			local239.method6019(local443.getName(), local443);
			@Pc(452) Class local452 = Class.forName("Class272");
			local239.method6019(local452.getName(), local452);
			@Pc(461) Class local461 = Class.forName("Class274");
			local239.method6019(local461.getName(), local461);
			@Pc(470) Class local470 = Class.forName("Interface14");
			local239.method6019(local470.getName(), local470);
			@Pc(480) Class local480 = local239.loadClass("client");
			synchronized (this) {
				if (this.aBoolean664) {
					return;
				}
				this.anApplet3 = (Applet) local480.getDeclaredConstructor().newInstance();
				local480.getMethod("providesignlink", local443).invoke(null, local128);
				this.anApplet3.init();
				if (this.aBoolean661) {
					this.anApplet3.start();
				}
				if (this.aBoolean662) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(540) Exception local540) {
			RuntimeException_Sub2.anInt7679 = -861963846;
			if (local540 instanceof InvocationTargetException) {
				@Pc(556) Throwable local556 = ((InvocationTargetException) local540).getTargetException();
				if (local556 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method6009(local540.toString(), local556, this);
			} else {
				RuntimeException_Sub2.method6009(null, local540, this);
			}
			this.method6058("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean662 = true;
		this.aBoolean661 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean662 = false;
		this.aBoolean661 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method6059(@OriginalArg(1) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean661 = this.aBoolean662 = false;
		this.aBoolean664 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}
}
