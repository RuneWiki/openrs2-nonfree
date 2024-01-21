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

@OriginalClass("loader!od")
public final class Class92 implements Runnable {

	@OriginalMember(owner = "loader!od", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString7;

	@OriginalMember(owner = "loader!od", name = "f", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!od", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!od", name = "o", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!od", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!od", name = "l", descriptor = "I")
	private static final int anInt4796 = 1;

	@OriginalMember(owner = "loader!od", name = "q", descriptor = "[Lloader!sc;")
	private Class93[] aClass93Array1;

	@OriginalMember(owner = "loader!od", name = "k", descriptor = "Lloader!ce;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "Lloader!gg;")
	private Class91 aClass91_2 = null;

	@OriginalMember(owner = "loader!od", name = "c", descriptor = "Ljava/io/File;")
	public File aFile4 = null;

	@OriginalMember(owner = "loader!od", name = "m", descriptor = "Lloader!sc;")
	private Class93 aClass93_1 = null;

	@OriginalMember(owner = "loader!od", name = "p", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!od", name = "r", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!od", name = "h", descriptor = "Lloader!sc;")
	private Class93 aClass93_3 = null;

	@OriginalMember(owner = "loader!od", name = "e", descriptor = "Lloader!sc;")
	private Class93 aClass93_2 = null;

	@OriginalMember(owner = "loader!od", name = "b", descriptor = "Lloader!gg;")
	private Class91 aClass91_3 = null;

	@OriginalMember(owner = "loader!od", name = "s", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "loader!od", name = "g", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!od", name = "n", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!od", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class92(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet3 = arg1;
		aString9 = "Unknown";
		aString8 = "1.1";
		try {
			aString9 = System.getProperty("java.vendor");
			aString8 = System.getProperty("java.version");
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
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(98) Exception local98) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(125) Exception local125) {
		}
		this.method3248(arg3, arg4, arg2);
		this.aBoolean218 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!od", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(15) Class91 local15;
			synchronized (this) {
				while (true) {
					if (this.aBoolean218) {
						return;
					}
					if (this.aClass91_2 != null) {
						local15 = this.aClass91_2;
						this.aClass91_2 = this.aClass91_2.aClass91_1;
						if (this.aClass91_2 == null) {
							this.aClass91_3 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(32) InterruptedException local32) {
					}
				}
			}
			try {
				@Pc(44) int local44 = local15.anInt4792;
				if (local44 == 1) {
					local15.anObject5 = new Socket(InetAddress.getByName((String) local15.anObject6), local15.anInt4791);
				} else if (local44 == 2) {
					@Pc(204) Thread local204 = new Thread((Runnable) local15.anObject6);
					local204.setDaemon(true);
					local204.start();
					local204.setPriority(local15.anInt4791);
					local15.anObject5 = local204;
				} else if (local44 == 4) {
					local15.anObject5 = new DataInputStream(((URL) local15.anObject6).openStream());
				} else {
					@Pc(77) Object[] local77;
					if (local44 == 8) {
						local77 = (Object[]) local15.anObject6;
						if (((Class) local77[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject5 = ((Class) local77[0]).getDeclaredMethod((String) local77[1], (Class[]) local77[2]);
					} else if (local44 == 9) {
						local77 = (Object[]) local15.anObject6;
						if (((Class) local77[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local15.anObject5 = ((Class) local77[0]).getDeclaredField((String) local77[1]);
					} else if (local44 == 3) {
						@Pc(181) String local181 = (local15.anInt4791 >> 24 & 0xFF) + "." + (local15.anInt4791 >> 16 & 0xFF) + "." + (local15.anInt4791 >> 8 & 0xFF) + "." + (local15.anInt4791 & 0xFF);
						local15.anObject5 = InetAddress.getByName(local181).getHostName();
					}
				}
				local15.anInt4793 = 1;
			} catch (@Pc(221) ThreadDeath local221) {
				throw local221;
			} catch (@Pc(224) Throwable local224) {
				local15.anInt4793 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!od", name = "a", descriptor = "(Ljava/lang/String;IIB)V")
	private void method3248(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(46) String[] local46 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString7, "/tmp/", "" };
		@Pc(75) String[] local75 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(77) int local77 = 0; local77 < 2; local77++) {
			for (@Pc(82) int local82 = 0; local82 < local75.length; local82++) {
				for (@Pc(88) int local88 = 0; local88 < local46.length; local88++) {
					try {
						@Pc(100) String local100 = local46[local88];
						if (local100.length() > 0 && !(new File(local100)).exists()) {
							continue;
						}
						@Pc(127) File local127 = new File(local100 + local75[local82]);
						@Pc(139) boolean local139;
						if (local77 == 1 && !local127.exists()) {
							local139 = local127.mkdir();
							if (!local139) {
								continue;
							}
						}
						@Pc(152) File local152;
						if (this.aClass93_3 == null) {
							try {
								local152 = new File(local127, "random.dat");
								if (local77 == 1 || local152.exists()) {
									this.aClass93_3 = new Class93(local152, "rw", 25L);
								}
							} catch (@Pc(168) Exception local168) {
								this.aClass93_3 = null;
							}
						}
						if (this.aFile5 == null) {
							@Pc(222) int local222;
							try {
								local127 = new File(local127, arg0);
								if (local77 == 1 && !local127.exists()) {
									local139 = local127.mkdir();
									if (!local139) {
										continue;
									}
								}
								local152 = new File(local127, "main_file_cache.dat2");
								if (local77 == 0 && !local152.exists()) {
									continue;
								}
								this.aClass93_2 = new Class93(local152, "rw", 52428800L);
								this.aClass93Array1 = new Class93[16];
								for (local222 = 0; local222 < 16; local222++) {
									this.aClass93Array1[local222] = new Class93(new File(local127, "main_file_cache.idx" + local222), "rw", 1048576L);
								}
								this.aClass93_1 = new Class93(new File(local127, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile4 = this.aFile5 = local127;
							} catch (@Pc(268) Exception local268) {
								try {
									this.aClass93_2.method3254();
									for (local222 = 0; local222 < 16; local222++) {
										this.aClass93Array1[local222].method3254();
									}
									this.aClass93_1.method3254();
								} catch (@Pc(295) Exception local295) {
								}
								this.aClass93_2 = this.aClass93_1 = null;
								this.aFile4 = this.aFile5 = null;
								this.aClass93Array1 = null;
							}
						}
					} catch (@Pc(312) Exception local312) {
					}
					if (this.aClass93_3 != null && this.aFile5 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile5 == null) {
			throw new RuntimeException();
		}
	}
}
