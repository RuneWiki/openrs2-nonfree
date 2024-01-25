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
	private static String aString221;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString222;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private static int anInt9612 = 0;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt9614;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt9615;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean712 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean711 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean714 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean713 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt9613 = 0;

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean711 = false;
		this.aBoolean714 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!d;Lloader!pq;)[B")
	private byte[] method8290(@OriginalArg(1) Class322 arg0, @OriginalArg(2) Class326 arg1) {
		@Pc(5) File local5;
		try {
			local5 = arg1.method8302(arg0.aString219);
		} catch (@Pc(7) Exception local7) {
			this.method8295("nocache");
			return null;
		}
		@Pc(20) byte[] local20 = this.method8294(local5);
		if (!this.method8292(local20, arg0)) {
			local20 = this.method8291(arg0, false);
			if (local20 == null) {
				local20 = this.method8291(arg0, true);
			}
			if (local20 == null) {
				this.method8295("download");
				return null;
			}
			if (!this.method8293(local5, local20)) {
				return null;
			}
			local20 = this.method8294(local5);
			if (!this.method8292(local20, arg0)) {
				this.method8295("mismatch");
				return null;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!d;Z)[B")
	private byte[] method8291(@OriginalArg(1) Class322 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class323.anIntArray842[anInt9612]);
		@Pc(26) Color local26 = new Color(Class323.anIntArray841[anInt9612]);
		@Pc(30) byte[] local30 = new byte[arg0.anInt9611];
		try {
			@Pc(41) InputStream local41;
			if (arg1) {
				@Pc(46) URL local46 = this.getCodeBase();
				@Pc(54) Socket local54 = new Socket(InetAddress.getByName(local46.getHost()), 443);
				local54.setSoTimeout(10000);
				@Pc(60) OutputStream local60 = local54.getOutputStream();
				local60.write(17);
				local60.write(("JAGGRAB " + local46.getFile() + arg0.aString220 + "\n\n").getBytes());
				local41 = local54.getInputStream();
			} else {
				local41 = (new URL(this.getCodeBase(), arg0.aString220)).openStream();
			}
			@Pc(91) int local91 = -1;
			@Pc(93) int local93 = 0;
			while (local93 < local30.length) {
				@Pc(107) int local107 = local30.length - local93;
				if (local107 > 1000) {
					local107 = 1000;
				}
				@Pc(118) int local118 = local41.read(local30, local93, local107);
				if (local118 < 0) {
					throw new EOFException();
				}
				local93 += local118;
				@Pc(136) int local136 = local93 * 100 / local30.length;
				if (local136 != local91) {
					try {
						@Pc(147) Graphics local147 = this.getGraphics();
						if (local147 == null) {
							this.repaint();
						} else {
							local147.setColor(Color.black);
							local147.fillRect(0, 0, this.anInt9614, this.anInt9615);
							local147.setColor(local19);
							local147.drawRect(this.anInt9614 / 2 - 152, this.anInt9615 / 2 - 18, 303, 33);
							@Pc(196) String local196 = arg0.aStringArray45[this.anInt9613] + " - " + local136 + "%";
							local147.setFont(local8);
							local147.setColor(local26);
							local147.drawString(local196, (this.anInt9614 - local12.stringWidth(local196)) / 2, this.anInt9615 / 2 + 4);
							local91 = local136;
						}
					} catch (@Pc(227) Exception local227) {
					}
				}
			}
			local41.close();
			if (arg0.anInt9610 != arg0.anInt9611) {
				@Pc(240) byte[] local240 = new byte[arg0.anInt9610];
				@Pc(245) Inflater local245 = new Inflater(true);
				local245.setInput(local30);
				local30 = local240;
				local245.inflate(local240);
			}
		} catch (@Pc(256) Exception local256) {
			return null;
		}
		return this.method8292(local30, arg0) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Z[BLloader!d;)Z")
	private boolean method8292(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class322 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg0);
			@Pc(22) byte[] local22 = local10.digest();
			for (@Pc(24) int local24 = 0; local24 < 20; local24++) {
				if (arg1.anIntArray840[local24] != local22[local24]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(47) Exception local47) {
			this.method8295("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	private boolean method8293(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			this.method8295("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method8294(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(28) DataInputStream local28 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(31) byte[] local31 = new byte[local9];
			local28.readFully(local31, 0, local9);
			local28.close();
			return local31;
		} catch (@Pc(41) IOException local41) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString222 = this.getParameter("unsignedurl");
			if (aString222 != null) {
				try {
					@Pc(8) SecurityManager local8 = System.getSecurityManager();
					if (local8 != null) {
						local8.checkExec("echo");
					}
				} catch (@Pc(16) SecurityException local16) {
					this.aBoolean712 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString222), "_parent");
					} catch (@Pc(29) Exception local29) {
					}
					return;
				}
			}
			aString221 = this.getParameter("crashurl");
			@Pc(36) int local36 = 0;
			@Pc(40) String local40 = this.getParameter("cachesubdirid");
			if (local40 != null) {
				local36 = Integer.parseInt(local40);
				if (local36 < 0 || local36 >= Class323.aStringArray46.length) {
					local36 = 0;
				}
			}
			@Pc(61) String local61 = this.getParameter("colourid");
			if (local61 != null) {
				anInt9612 = Integer.parseInt(local61);
				if (anInt9612 < 0 || anInt9612 >= Class323.anIntArray842.length) {
					anInt9612 = 0;
				}
			}
			this.anInt9614 = this.getSize().width;
			this.anInt9615 = this.getSize().height;
			@Pc(92) int local92 = 32;
			try {
				@Pc(97) int local97 = Integer.parseInt(this.getParameter("modewhat"));
				local92 += local97;
			} catch (@Pc(103) Exception local103) {
			}
			try {
				@Pc(107) String local107 = this.getParameter("lang");
				if (local107 != null) {
					this.anInt9613 = Integer.parseInt(local107);
				}
			} catch (@Pc(116) Exception local116) {
			}
			@Pc(126) Class326 local126;
			try {
				local126 = new Class326(this, local92, Class323.aStringArray46[local36], 32);
			} catch (@Pc(128) Exception local128) {
				this.method8295("nocache");
				return;
			}
			@Pc(135) unpack local135 = null;
			@Pc(144) byte[] local144;
			try {
				Class.forName("java.util.jar.Pack200");
				local144 = this.method8290(Class323.aClass322_2, local126);
				if (local144 == null) {
					return;
				}
				local135 = new unpack_Sub1(local144);
			} catch (@Pc(156) Throwable local156) {
			}
			if (local135 == null) {
				local144 = this.method8290(Class323.aClass322_1, local126);
				if (local144 == null) {
					return;
				}
				@Pc(173) unpack local173 = new unpack(local144);
				@Pc(178) ClassLoader_Sub1 local178 = new ClassLoader_Sub1(local173);
				@Pc(181) Class local181 = Class.forName("unpack");
				local178.method8286(local181.getName(), local181);
				@Pc(191) Class local191 = local178.loadClass("unpackclass");
				@Pc(197) byte[] local197 = this.method8290(Class323.aClass322_3, local126);
				if (local197 == null) {
					return;
				}
				local135 = (unpack) local191.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local197, Boolean.TRUE);
			}
			@Pc(231) ClassLoader_Sub1 local231 = new ClassLoader_Sub1(local135);
			@Pc(234) Class local234 = Class.forName("Class325");
			local231.method8286(local234.getName(), local234);
			@Pc(243) Class local243 = Class.forName("Class326");
			local231.method8286(local243.getName(), local243);
			@Pc(252) Class local252 = Class.forName("Class327");
			local231.method8286(local252.getName(), local252);
			@Pc(261) Class local261 = Class.forName("Class324");
			local231.method8286(local261.getName(), local261);
			@Pc(270) Class local270 = Class.forName("Interface21");
			local231.method8286(local270.getName(), local270);
			@Pc(280) Class local280 = local231.loadClass("client");
			synchronized (this) {
				if (this.aBoolean713) {
					return;
				}
				this.anApplet2 = (Applet) local280.getDeclaredConstructor().newInstance();
				local280.getMethod("providesignlink", local243).invoke(null, local126);
				this.anApplet2.init();
				if (this.aBoolean711) {
					this.anApplet2.start();
				}
				if (this.aBoolean714) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(339) Exception local339) {
			RuntimeException_Sub2.anInt9608 = 358813685;
			if (local339 instanceof InvocationTargetException) {
				@Pc(355) Throwable local355 = ((InvocationTargetException) local339).getTargetException();
				if (local355 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method8275(this, local339.toString(), local355);
			} else {
				RuntimeException_Sub2.method8275(this, null, local339);
			}
			this.method8295("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean711 = true;
		this.aBoolean714 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method8295(@OriginalArg(0) String arg0) {
		if (this.aBoolean712) {
			return;
		}
		this.aBoolean712 = true;
		try {
			if (aString221 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString221 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean713 = true;
		this.aBoolean711 = this.aBoolean714 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean713 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}
}
