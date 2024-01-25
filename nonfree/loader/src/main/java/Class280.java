import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!or")
public final class Class280 implements Runnable {

	@OriginalMember(owner = "loader!or", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString214;

	@OriginalMember(owner = "loader!or", name = "r", descriptor = "Ljava/lang/String;")
	private static String aString215;

	@OriginalMember(owner = "loader!or", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString216;

	@OriginalMember(owner = "loader!or", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString217;

	@OriginalMember(owner = "loader!or", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString218;

	@OriginalMember(owner = "loader!or", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString220;

	@OriginalMember(owner = "loader!or", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString221;

	@OriginalMember(owner = "loader!or", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!or", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!or", name = "o", descriptor = "I")
	private static final int anInt7336 = 1;

	@OriginalMember(owner = "loader!or", name = "z", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "loader!or", name = "y", descriptor = "J")
	private static volatile long aLong231 = 0L;

	@OriginalMember(owner = "loader!or", name = "p", descriptor = "Lloader!dh;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "loader!or", name = "j", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!or", name = "k", descriptor = "Lloader!gp;")
	private Class278 aClass278_2 = null;

	@OriginalMember(owner = "loader!or", name = "m", descriptor = "Lloader!oh;")
	private Class279 aClass279_3 = null;

	@OriginalMember(owner = "loader!or", name = "n", descriptor = "Lloader!gp;")
	private Class278 aClass278_3 = null;

	@OriginalMember(owner = "loader!or", name = "l", descriptor = "Z")
	private boolean aBoolean539 = false;

	@OriginalMember(owner = "loader!or", name = "h", descriptor = "Lloader!oh;")
	private Class279 aClass279_2 = null;

	@OriginalMember(owner = "loader!or", name = "b", descriptor = "Lloader!oh;")
	private Class279 aClass279_1 = null;

	@OriginalMember(owner = "loader!or", name = "q", descriptor = "I")
	private final int anInt7335;

	@OriginalMember(owner = "loader!or", name = "d", descriptor = "Ljava/lang/String;")
	private String aString219;

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!or", name = "t", descriptor = "[Lloader!oh;")
	private Class279[] aClass279Array1;

	@OriginalMember(owner = "loader!or", name = "A", descriptor = "Lloader!d;")
	private Class274 aClass274_1;

	@OriginalMember(owner = "loader!or", name = "v", descriptor = "Lloader!e;")
	private Class275 aClass275_1;

	@OriginalMember(owner = "loader!or", name = "u", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4;

	@OriginalMember(owner = "loader!or", name = "b", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Lloader!oh;")
	private static Class279 method5811(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(19) String local19;
		if (arg1 == 33) {
			local19 = "jagex_" + arg2 + "_preferences" + arg0 + "_rc.dat";
		} else if (arg1 == 34) {
			local19 = "jagex_" + arg2 + "_preferences" + arg0 + "_wip.dat";
		} else {
			local19 = "jagex_" + arg2 + "_preferences" + arg0 + ".dat";
		}
		@Pc(89) String[] local89 = new String[] { "c:/rscache/", "/rscache/", aString214, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(91) int local91 = 0; local91 < local89.length; local91++) {
			@Pc(103) String local103 = local89[local91];
			if (local103.length() <= 0 || (new File(local103)).exists()) {
				try {
					return new Class279(new File(local103, local19), "rw", 10000L);
				} catch (@Pc(128) Exception local128) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;")
	private static File method5819(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(15) File local15 = (File) aHashtable4.get(arg2);
		if (local15 != null) {
			return local15;
		}
		@Pc(54) String[] local54 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString214, "/tmp/", "" };
		@Pc(79) String[] local79 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(81) int local81 = 0; local81 < 2; local81++) {
			for (@Pc(88) int local88 = 0; local88 < local79.length; local88++) {
				for (@Pc(94) int local94 = 0; local94 < local54.length; local94++) {
					@Pc(132) String local132 = local54[local94] + local79[local88] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(134) RandomAccessFile local134 = null;
					try {
						@Pc(139) File local139 = new File(local132);
						if (local81 != 0 || local139.exists()) {
							@Pc(151) String local151 = local54[local94];
							if (local81 != 1 || local151.length() <= 0 || (new File(local151)).exists()) {
								(new File(local54[local94] + local79[local88])).mkdir();
								if (arg0 != null) {
									(new File(local54[local94] + local79[local88] + "/" + arg0)).mkdir();
								}
								local134 = new RandomAccessFile(local139, "rw");
								@Pc(215) int local215 = local134.read();
								local134.seek(0L);
								local134.write(local215);
								local134.seek(0L);
								local134.close();
								aHashtable4.put(arg2, local139);
								return local139;
							}
						}
					} catch (@Pc(234) Exception local234) {
						try {
							if (local134 != null) {
								local134.close();
							}
						} catch (@Pc(244) Exception local244) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!or", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class280(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anApplet3 = arg0;
		aString218 = "1.1";
		this.anInt7335 = arg1;
		aString217 = "Unknown";
		this.aString219 = arg2;
		try {
			aString217 = System.getProperty("java.vendor");
			aString218 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString221 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString221 = "Unknown";
		}
		aString215 = aString221.toLowerCase();
		try {
			aString216 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString216 = "";
		}
		try {
			aString220 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString220 = "";
		}
		try {
			aString214 = System.getProperty("user.home");
			if (aString214 != null) {
				aString214 = aString214 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (aString214 == null) {
			aString214 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(122) Exception local122) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(149) Exception local149) {
		}
		this.aClass279_1 = new Class279(method5819(null, this.anInt7335, "random.dat"), "rw", 25L);
		this.aClass279_3 = new Class279(this.method5809("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass279_2 = new Class279(this.method5809("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass279Array1 = new Class279[arg3];
		for (@Pc(190) int local190 = 0; local190 < arg3; local190++) {
			this.aClass279Array1[local190] = new Class279(this.method5809("main_file_cache.idx" + local190), "rw", 1048576L);
		}
		try {
			this.aClass274_1 = new Class274();
		} catch (@Pc(226) Throwable local226) {
		}
		try {
			this.aClass275_1 = new Class275();
		} catch (@Pc(233) Throwable local233) {
		}
		@Pc(236) ThreadGroup local236 = Thread.currentThread().getThreadGroup();
		for (@Pc(239) ThreadGroup local239 = local236.getParent(); local239 != null; local239 = local239.getParent()) {
			local236 = local239;
		}
		@Pc(250) Thread[] local250 = new Thread[1000];
		local236.enumerate(local250);
		for (@Pc(256) int local256 = 0; local256 < local250.length; local256++) {
			if (local250[local256] != null && local250[local256].getName().startsWith("AWT")) {
				local250[local256].setPriority(1);
			}
		}
		this.aBoolean539 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "(ILjava/lang/String;)Lloader!gp;")
	private Class278 method5790(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 != -31589) {
			aString215 = null;
		}
		return this.method5803(0, 0, 21, false, arg1);
	}

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "(ILjava/lang/String;Z)Lloader!gp;")
	private Class278 method5791(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 == -14340) {
			return arg2 ? this.method5803(0, 0, 12, false, arg1) : this.method5803(0, 0, 13, false, arg1);
		} else {
			return (Class278) null;
		}
	}

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "(B)V")
	private void method5792(@OriginalArg(0) byte arg0) {
		if (arg0 != 102) {
			this.aClass279_2 = null;
		}
		aLong231 = Class277.method5773() + 5000L;
	}

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	private byte[] method5793(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg1 <= 85) {
			this.aString219 = null;
		}
		@Pc(14) Class278 local14 = this.method5812(arg0, 0, true, 21, 0);
		return (byte[]) local14.anObject11;
	}

	@OriginalMember(owner = "loader!or", name = "e", descriptor = "(I)Z")
	private boolean method5794(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method5807(null, 124);
		}
		return this.aClass274_1 != null;
	}

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "(Ljava/net/URL;I)Lloader!gp;")
	private Class278 method5795(@OriginalArg(0) URL arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= -88) {
			this.method5803(120, -127, 9, false, null);
		}
		return this.method5803(0, 0, 4, false, arg0);
	}

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Lloader!gp;")
	private Class278 method5796(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class[] arg3) {
		return arg2 == 0 ? this.method5803(0, 0, 8, false, new Object[] { arg1, arg0, arg3 }) : (Class278) null;
	}

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "(II)Lloader!gp;")
	private Class278 method5797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 3) {
			this.aClass279Array1 = null;
		}
		return this.method5803(0, arg0, 3, false, null);
	}

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "(IIZLjava/awt/Component;)Lloader!gp;")
	private Class278 method5798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Component arg3) {
		if (!arg2) {
			this.method5794(71);
		}
		@Pc(9) Point local9 = arg3.getLocationOnScreen();
		return this.method5803(local9.y + arg0, arg1 - -local9.x, 14, !arg2, null);
	}

	@OriginalMember(owner = "loader!or", name = "b", descriptor = "(I)V")
	private void method5799(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean539 = true;
			this.notifyAll();
			if (arg0 != 21230) {
				this.aClass279_3 = null;
			}
		}
		try {
			this.aThread4.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
		if (this.aClass279_3 != null) {
			try {
				this.aClass279_3.method5784(-1);
			} catch (@Pc(39) IOException local39) {
			}
		}
		if (this.aClass279_2 != null) {
			try {
				this.aClass279_2.method5784(-1);
			} catch (@Pc(49) IOException local49) {
			}
		}
		if (this.aClass279Array1 != null) {
			for (@Pc(56) int local56 = 0; local56 < this.aClass279Array1.length; local56++) {
				if (this.aClass279Array1[local56] != null) {
					try {
						this.aClass279Array1[local56].method5784(arg0 ^ 0xFFFFAD11);
					} catch (@Pc(80) IOException local80) {
					}
				}
			}
		}
		if (this.aClass279_1 != null) {
			try {
				this.aClass279_1.method5784(arg0 - 21231);
			} catch (@Pc(94) IOException local94) {
			}
		}
	}

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "(Ljava/lang/String;II)Lloader!gp;")
	private Class278 method5800(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 <= 61) {
			this.aClass275_1 = null;
		}
		return this.method5803(0, arg2, 1, false, arg0);
	}

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lloader!gp;")
	private Class278 method5801(@OriginalArg(0) Runnable arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		if (arg1 != -121) {
			this.aThread4 = null;
		}
		return this.method5803(0, arg2, 2, false, arg0);
	}

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "(Ljava/awt/Frame;I)Lloader!gp;")
	private Class278 method5802(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.aClass275_1 = null;
		}
		return this.method5803(0, 0, 7, false, arg0);
	}

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "(IIIZLjava/lang/Object;)Lloader!gp;")
	private Class278 method5803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class278 local3 = new Class278();
		local3.anInt7327 = arg1;
		local3.anInt7328 = arg2;
		local3.anObject12 = arg4;
		local3.anInt7330 = arg0;
		synchronized (this) {
			if (arg3) {
				this.method5801(null, (byte) 96, 40);
			}
			if (this.aClass278_2 == null) {
				this.aClass278_2 = this.aClass278_3 = local3;
			} else {
				this.aClass278_2.aClass278_1 = local3;
				this.aClass278_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lloader!gp;")
	private Class278 method5804(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) {
		if (arg0 < 103) {
			this.aClass279_2 = null;
		}
		return this.method5803(0, 0, 9, false, new Object[] { arg2, arg1 });
	}

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "(ILjava/awt/Component;IZ[ILjava/awt/Point;)Lloader!gp;")
	private Class278 method5805(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Point arg5) {
		if (!arg3) {
			this.aClass278_3 = null;
		}
		return this.method5803(arg2, arg0, 17, false, new Object[] { arg1, arg4, arg5 });
	}

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "(ILjava/lang/Class;)V")
	private void method5806(@OriginalArg(1) Class arg0) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(35) Method local35;
		if (!aString215.startsWith("mac")) {
			local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local35, Boolean.TRUE);
			local35.invoke(local14, arg0, "jawt");
			local25.invoke(local35, Boolean.FALSE);
		}
		local35 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		local25.invoke(local35, Boolean.TRUE);
		if (!aString215.startsWith("win")) {
			throw new Exception();
		}
		local35.invoke(local14, arg0, this.method5809("sw3d.dll").toString());
		local25.invoke(local35, Boolean.FALSE);
	}

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "(Ljava/lang/Class;I)Lloader!gp;")
	private Class278 method5807(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 33) {
			this.method5804(-24, null, null);
		}
		return this.method5803(0, 0, 20, false, arg0);
	}

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lloader!gp;")
	private Class278 method5808(@OriginalArg(0) int arg0, @OriginalArg(1) Transferable arg1) {
		if (arg0 != 8602) {
			this.aThread4 = null;
		}
		return this.method5803(0, 0, 19, false, arg1);
	}

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method5809(@OriginalArg(0) String arg0) {
		return method5819(this.aString219, this.anInt7335, arg0);
	}

	@OriginalMember(owner = "loader!or", name = "b", descriptor = "(Ljava/lang/Class;I)Lloader!gp;")
	private Class278 method5810(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		return arg1 == 10 ? this.method5803(0, 0, 11, false, arg0) : (Class278) null;
	}

	@OriginalMember(owner = "loader!or", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class278 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean539) {
						return;
					}
					if (this.aClass278_3 != null) {
						local16 = this.aClass278_3;
						this.aClass278_3 = this.aClass278_3.aClass278_1;
						if (this.aClass278_3 == null) {
							this.aClass278_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
				}
			}
			try {
				@Pc(45) int local45 = local16.anInt7328;
				if (local45 == 1) {
					if (Class277.method5773() < aLong231) {
						throw new IOException();
					}
					local16.anObject11 = new Socket(InetAddress.getByName((String) local16.anObject12), local16.anInt7327);
				} else if (local45 == 2) {
					@Pc(673) Thread local673 = new Thread((Runnable) local16.anObject12);
					local673.setDaemon(true);
					local673.start();
					local673.setPriority(local16.anInt7327);
					local16.anObject11 = local673;
				} else if (local45 == 4) {
					if (aLong231 > Class277.method5773()) {
						throw new IOException();
					}
					local16.anObject11 = new DataInputStream(((URL) local16.anObject12).openStream());
				} else {
					@Pc(90) Object[] local90;
					if (local45 == 8) {
						local90 = (Object[]) local16.anObject12;
						if (((Class) local90[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject11 = ((Class) local90[0]).getDeclaredMethod((String) local90[1], (Class[]) local90[2]);
					} else if (local45 == 9) {
						local90 = (Object[]) local16.anObject12;
						if (((Class) local90[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject11 = ((Class) local90[0]).getDeclaredField((String) local90[1]);
					} else if (local45 == 18) {
						@Pc(159) Clipboard local159 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject11 = local159.getContents(null);
					} else if (local45 == 19) {
						@Pc(172) Transferable local172 = (Transferable) local16.anObject12;
						@Pc(175) Clipboard local175 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local175.setContents(local172, null);
					} else {
						@Pc(484) String local484;
						if (local45 == 3) {
							if (aLong231 > Class277.method5773()) {
								throw new IOException();
							}
							local484 = (local16.anInt7327 >> 24 & 0xFF) + "." + (local16.anInt7327 >> 16 & 0xFF) + "." + (local16.anInt7327 >> 8 & 0xFF) + "." + (local16.anInt7327 & 0xFF);
							local16.anObject11 = InetAddress.getByName(local484).getHostName();
						} else if (local45 == 21) {
							if (Class277.method5773() < aLong231) {
								throw new IOException();
							}
							local16.anObject11 = InetAddress.getByName((String) local16.anObject12).getAddress();
						} else if (local45 == 5) {
							local16.anObject11 = this.aClass274_1.method5761();
						} else if (local45 == 6) {
							@Pc(558) Frame local558 = new Frame("Jagex Full Screen");
							local16.anObject11 = local558;
							local558.setResizable(false);
							this.aClass274_1.method5760(local16.anInt7330 >> 16, local16.anInt7327 >>> 16, local558, local16.anInt7327 & 0xFFFF, local16.anInt7330 & 0xFFFF);
						} else if (local45 == 7) {
							this.aClass274_1.method5762();
						} else {
							@Pc(227) int local227;
							if (local45 == 11) {
								@Pc(214) Field local214 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local214.setAccessible(true);
								@Pc(225) Vector local225 = (Vector) local214.get(((Class) local16.anObject12).getClassLoader());
								for (local227 = 0; local225.size() > local227; local227++) {
									@Pc(235) Object local235 = local225.elementAt(local227);
									@Pc(242) Method local242 = local235.getClass().getDeclaredMethod("finalize");
									local242.setAccessible(true);
									local242.invoke(local235);
									local242.setAccessible(false);
									@Pc(259) Field local259 = local235.getClass().getDeclaredField("handle");
									local259.setAccessible(true);
									local259.set(local235, Integer.valueOf(0));
									local259.setAccessible(false);
								}
								local214.setAccessible(false);
							} else {
								@Pc(291) Class279 local291;
								if (local45 == 12) {
									local291 = method5811((String) local16.anObject12, this.anInt7335, this.aString219);
									local16.anObject11 = local291;
								} else if (local45 == 13) {
									local291 = method5811((String) local16.anObject12, this.anInt7335, "");
									local16.anObject11 = local291;
								} else if (local45 == 14) {
									@Pc(308) int local308 = local16.anInt7327;
									@Pc(311) int local311 = local16.anInt7330;
									this.aClass275_1.method5770(local311, local308);
								} else if (local45 == 15) {
									@Pc(333) boolean local333 = local16.anInt7327 != 0;
									@Pc(337) Component local337 = (Component) local16.anObject12;
									this.aClass275_1.method5771(local337, local333);
								} else if (local45 == 17) {
									local90 = (Object[]) local16.anObject12;
									this.aClass275_1.method5772((Component) local90[0], (int[]) local90[1], (Point) local90[2], local16.anInt7327, local16.anInt7330);
								} else if (local45 == 16) {
									try {
										if (!aString215.startsWith("win")) {
											throw new Exception();
										}
										local484 = (String) local16.anObject12;
										if (!local484.startsWith("http://") && !local484.startsWith("https://")) {
											throw new Exception();
										}
										@Pc(498) String local498 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
										for (local227 = 0; local227 < local484.length(); local227++) {
											if (local498.indexOf(local484.charAt(local227)) == -1) {
												throw new Exception();
											}
										}
										Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local484 + "\"");
										local16.anObject11 = null;
									} catch (@Pc(535) Exception local535) {
										local16.anObject11 = local535;
										throw local535;
									}
								} else if (local45 == 20) {
									try {
										@Pc(395) Class[] local395 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
										@Pc(397) Runtime local397 = Runtime.getRuntime();
										@Pc(403) Method local403 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local395);
										local403.setAccessible(true);
										if (aString215.startsWith("win")) {
											if (aString216.startsWith("amd64") || aString216.startsWith("x86_64")) {
												local403.invoke(local397, local16.anObject12, this.method5809("jagmisc64.dll").toString());
											} else {
												local403.invoke(local397, local16.anObject12, this.method5809("jagmisc.dll").toString());
											}
										}
										local403.setAccessible(false);
									} catch (@Pc(462) Throwable local462) {
										local16.anObject11 = local462;
									}
								} else {
									throw new Exception("");
								}
							}
						}
					}
				}
				local16.anInt7329 = 1;
			} catch (@Pc(712) ThreadDeath local712) {
				throw local712;
			} catch (@Pc(715) Throwable local715) {
				local16.anInt7329 = 2;
			}
			synchronized (local16) {
				local16.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "(Ljava/lang/Object;IZII)Lloader!gp;")
	private Class278 method5812(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class278 local3 = new Class278();
		synchronized (local3) {
			local3.anInt7330 = arg1;
			local3.anInt7328 = arg3;
			local3.anInt7327 = arg4;
			if (!arg2) {
				return (Class278) null;
			}
			local3.anObject12 = arg0;
			synchronized (this) {
				if (this.aClass278_2 == null) {
					this.aClass278_2 = this.aClass278_3 = local3;
				} else {
					this.aClass278_2.aClass278_1 = local3;
					this.aClass278_2 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(62) InterruptedException local62) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "(I)Lloader!gp;")
	private Class278 method5813(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			aString217 = null;
		}
		return this.method5803(0, 0, 5, false, null);
	}

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "(IIIII)Lloader!gp;")
	private Class278 method5814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 != 6) {
			this.method5799(22);
		}
		return this.method5803((arg0 << 16) + arg2, arg1 + (arg3 << 16), 6, false, null);
	}

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "(ILjava/awt/Component;Z)Lloader!gp;")
	private Class278 method5815(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != 0) {
			aString215 = null;
		}
		return this.method5803(0, arg2 ? 1 : 0, 15, false, arg1);
	}

	@OriginalMember(owner = "loader!or", name = "a", descriptor = "(Ljava/lang/String;Z)Lloader!gp;")
	private Class278 method5816(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			aString217 = null;
		}
		return this.method5803(0, 0, 16, !arg1, arg0);
	}

	@OriginalMember(owner = "loader!or", name = "c", descriptor = "(I)Lloader!dh;")
	private Interface14 method5817(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method5808(-54, null);
		}
		return this.anInterface14_1;
	}

	@OriginalMember(owner = "loader!or", name = "d", descriptor = "(I)Lloader!gp;")
	private Class278 method5818(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			method5819(null, 111, null);
		}
		return this.method5803(0, 0, 18, false, null);
	}
}
