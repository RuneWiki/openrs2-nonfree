import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!rf")
public final class Class94 implements Runnable {

	@OriginalMember(owner = "loader!rf", name = "b", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!rf", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString7;

	@OriginalMember(owner = "loader!rf", name = "q", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!rf", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!rf", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!rf", name = "j", descriptor = "I")
	private static final int anInt4389 = 1;

	@OriginalMember(owner = "loader!rf", name = "o", descriptor = "Lloader!sb;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!rf", name = "a", descriptor = "[Lloader!kc;")
	private Class92[] aClass92Array1;

	@OriginalMember(owner = "loader!rf", name = "s", descriptor = "Ljava/io/File;")
	public File aFile5 = null;

	@OriginalMember(owner = "loader!rf", name = "d", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!rf", name = "n", descriptor = "Lloader!kc;")
	private Class92 aClass92_1 = null;

	@OriginalMember(owner = "loader!rf", name = "f", descriptor = "Lloader!pe;")
	private Class93 aClass93_2 = null;

	@OriginalMember(owner = "loader!rf", name = "i", descriptor = "Lloader!kc;")
	private Class92 aClass92_2 = null;

	@OriginalMember(owner = "loader!rf", name = "l", descriptor = "Lloader!kc;")
	private Class92 aClass92_3 = null;

	@OriginalMember(owner = "loader!rf", name = "m", descriptor = "Ljava/io/File;")
	private File aFile6 = null;

	@OriginalMember(owner = "loader!rf", name = "p", descriptor = "Lloader!pe;")
	private Class93 aClass93_3 = null;

	@OriginalMember(owner = "loader!rf", name = "k", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "loader!rf", name = "r", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!rf", name = "g", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!rf", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class94(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString8 = "Unknown";
		aString9 = "1.1";
		this.anApplet3 = arg1;
		try {
			aString8 = System.getProperty("java.vendor");
			aString9 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString7 = System.getProperty("user.home");
			if (aString7 != null) {
				aString7 = aString7 + "/";
			}
		} catch (@Pc(60) Exception local60) {
		}
		if (aString7 == null) {
			aString7 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(71) Throwable local71) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(99) Exception local99) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(127) Exception local127) {
		}
		this.method3181(arg4, arg3, arg2);
		this.aBoolean225 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!rf", name = "a", descriptor = "(ILjava/lang/String;IB)V")
	private void method3181(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(43) String[] local43 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString7, "/tmp/", "" };
		@Pc(68) String[] local68 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(70) int local70 = 0; local70 < 2; local70++) {
			for (@Pc(75) int local75 = 0; local75 < local68.length; local75++) {
				for (@Pc(85) int local85 = 0; local85 < local43.length; local85++) {
					try {
						@Pc(97) String local97 = local43[local85];
						if (local97.length() > 0 && !(new File(local97)).exists()) {
							continue;
						}
						@Pc(123) File local123 = new File(local97 + local68[local75]);
						@Pc(135) boolean local135;
						if (local70 == 1 && !local123.exists()) {
							local135 = local123.mkdir();
							if (!local135) {
								continue;
							}
						}
						@Pc(148) File local148;
						if (this.aClass92_2 == null) {
							try {
								local148 = new File(local123, "random.dat");
								if (local70 == 1 || local148.exists()) {
									this.aClass92_2 = new Class92(local148, "rw", 25L);
								}
							} catch (@Pc(167) Exception local167) {
								this.aClass92_2 = null;
							}
						}
						if (this.aFile6 == null) {
							@Pc(219) int local219;
							try {
								local123 = new File(local123, arg1);
								if (local70 == 1 && !local123.exists()) {
									local135 = local123.mkdir();
									if (!local135) {
										continue;
									}
								}
								local148 = new File(local123, "main_file_cache.dat2");
								if (local70 == 0 && !local148.exists()) {
									continue;
								}
								this.aClass92_1 = new Class92(local148, "rw", 104857600L);
								this.aClass92Array1 = new Class92[16];
								for (local219 = 0; local219 < 16; local219++) {
									this.aClass92Array1[local219] = new Class92(new File(local123, "main_file_cache.idx" + local219), "rw", 1048576L);
								}
								this.aClass92_3 = new Class92(new File(local123, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile5 = this.aFile6 = local123;
							} catch (@Pc(269) Exception local269) {
								try {
									this.aClass92_1.method3171();
									for (local219 = 0; local219 < 16; local219++) {
										this.aClass92Array1[local219].method3171();
									}
									this.aClass92_3.method3171();
								} catch (@Pc(292) Exception local292) {
								}
								this.aFile5 = this.aFile6 = null;
								this.aClass92_1 = this.aClass92_3 = null;
								this.aClass92Array1 = null;
							}
						}
					} catch (@Pc(309) Exception local309) {
					}
					if (this.aClass92_2 != null && this.aFile6 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile6 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!rf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class93 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean225) {
						return;
					}
					if (this.aClass93_2 != null) {
						local17 = this.aClass93_2;
						this.aClass93_2 = this.aClass93_2.aClass93_1;
						if (this.aClass93_2 == null) {
							this.aClass93_3 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(34) InterruptedException local34) {
					}
				}
			}
			try {
				@Pc(46) int local46 = local17.anInt4388;
				if (local46 == 1) {
					local17.anObject6 = new Socket(InetAddress.getByName((String) local17.anObject5), local17.anInt4387);
				} else if (local46 == 2) {
					@Pc(73) Thread local73 = new Thread((Runnable) local17.anObject5);
					local73.setDaemon(true);
					local73.start();
					local73.setPriority(local17.anInt4387);
					local17.anObject6 = local73;
				} else if (local46 == 4) {
					local17.anObject6 = new DataInputStream(((URL) local17.anObject5).openStream());
				} else {
					@Pc(112) Object[] local112;
					if (local46 == 8) {
						local112 = (Object[]) local17.anObject5;
						if (((Class) local112[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local112[0]).getDeclaredMethod((String) local112[1], (Class[]) local112[2]);
					} else if (local46 == 9) {
						local112 = (Object[]) local17.anObject5;
						if (((Class) local112[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local112[0]).getDeclaredField((String) local112[1]);
					} else if (local46 == 3) {
						@Pc(175) String local175 = (local17.anInt4387 >> 24 & 0xFF) + "." + (local17.anInt4387 >> 16 & 0xFF) + "." + (local17.anInt4387 >> 8 & 0xFF) + "." + (local17.anInt4387 & 0xFF);
						local17.anObject6 = InetAddress.getByName(local175).getHostName();
					}
				}
				local17.anInt4386 = 1;
			} catch (@Pc(217) ThreadDeath local217) {
				throw local217;
			} catch (@Pc(220) Throwable local220) {
				local17.anInt4386 = 2;
			}
		}
	}
}
