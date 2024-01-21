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

@OriginalClass("loader!ja")
public final class Class104 implements Runnable {

	@OriginalMember(owner = "loader!ja", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!ja", name = "c", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ja", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString9;

	@OriginalMember(owner = "loader!ja", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString10;

	@OriginalMember(owner = "loader!ja", name = "p", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ja", name = "b", descriptor = "I")
	private static final int anInt4290 = 1;

	@OriginalMember(owner = "loader!ja", name = "l", descriptor = "[Lloader!pa;")
	private Class105[] aClass105Array1;

	@OriginalMember(owner = "loader!ja", name = "n", descriptor = "Lloader!ra;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!ja", name = "o", descriptor = "Ljava/io/File;")
	public File aFile5 = null;

	@OriginalMember(owner = "loader!ja", name = "f", descriptor = "Ljava/io/File;")
	private File aFile4 = null;

	@OriginalMember(owner = "loader!ja", name = "r", descriptor = "Lloader!pa;")
	private Class105 aClass105_1 = null;

	@OriginalMember(owner = "loader!ja", name = "k", descriptor = "Lloader!ef;")
	private Class103 aClass103_3 = null;

	@OriginalMember(owner = "loader!ja", name = "a", descriptor = "Lloader!ef;")
	private Class103 aClass103_2 = null;

	@OriginalMember(owner = "loader!ja", name = "h", descriptor = "Lloader!pa;")
	private Class105 aClass105_3 = null;

	@OriginalMember(owner = "loader!ja", name = "d", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!ja", name = "g", descriptor = "Lloader!pa;")
	private Class105 aClass105_2 = null;

	@OriginalMember(owner = "loader!ja", name = "m", descriptor = "Z")
	private boolean aBoolean192 = false;

	@OriginalMember(owner = "loader!ja", name = "e", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!ja", name = "q", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!ja", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class104(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString8 = "1.1";
		this.anApplet2 = arg1;
		aString10 = "Unknown";
		try {
			aString10 = System.getProperty("java.vendor");
			aString8 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString9 = System.getProperty("user.home");
			if (aString9 != null) {
				aString9 = aString9 + "/";
			}
		} catch (@Pc(60) Exception local60) {
		}
		if (aString9 == null) {
			aString9 = "~/";
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
		} catch (@Pc(126) Exception local126) {
		}
		this.method3355(arg2, arg3, arg4);
		this.aBoolean192 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!ja", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class103 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean192) {
						return;
					}
					if (this.aClass103_2 != null) {
						local17 = this.aClass103_2;
						this.aClass103_2 = this.aClass103_2.aClass103_1;
						if (this.aClass103_2 == null) {
							this.aClass103_3 = null;
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
				@Pc(46) int local46 = local17.anInt4287;
				if (local46 == 1) {
					local17.anObject6 = new Socket(InetAddress.getByName((String) local17.anObject5), local17.anInt4289);
				} else if (local46 == 2) {
					@Pc(206) Thread local206 = new Thread((Runnable) local17.anObject5);
					local206.setDaemon(true);
					local206.start();
					local206.setPriority(local17.anInt4289);
					local17.anObject6 = local206;
				} else if (local46 == 4) {
					local17.anObject6 = new DataInputStream(((URL) local17.anObject5).openStream());
				} else {
					@Pc(134) Object[] local134;
					if (local46 == 8) {
						local134 = (Object[]) local17.anObject5;
						if (((Class) local134[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local134[0]).getDeclaredMethod((String) local134[1], (Class[]) local134[2]);
					} else if (local46 == 9) {
						local134 = (Object[]) local17.anObject5;
						if (((Class) local134[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local134[0]).getDeclaredField((String) local134[1]);
					} else if (local46 == 3) {
						@Pc(123) String local123 = (local17.anInt4289 >> 24 & 0xFF) + "." + (local17.anInt4289 >> 16 & 0xFF) + "." + (local17.anInt4289 >> 8 & 0xFF) + "." + (local17.anInt4289 & 0xFF);
						local17.anObject6 = InetAddress.getByName(local123).getHostName();
					} else {
						throw new Exception();
					}
				}
				local17.anInt4288 = 1;
			} catch (@Pc(223) ThreadDeath local223) {
				throw local223;
			} catch (@Pc(226) Throwable local226) {
				local17.anInt4288 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!ja", name = "a", descriptor = "(ILjava/lang/String;BI)V")
	private void method3355(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString9, "/tmp/", "" };
		@Pc(77) String[] local77 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(79) int local79 = 0; local79 < 2; local79++) {
			for (@Pc(86) int local86 = 0; local86 < local77.length; local86++) {
				for (@Pc(92) int local92 = 0; local92 < local44.length; local92++) {
					try {
						@Pc(100) String local100 = local44[local92];
						if (local100.length() > 0 && !(new File(local100)).exists()) {
							continue;
						}
						@Pc(128) File local128 = new File(local100 + local77[local86]);
						@Pc(140) boolean local140;
						if (local79 == 1 && !local128.exists()) {
							local140 = local128.mkdir();
							if (!local140) {
								continue;
							}
						}
						@Pc(153) File local153;
						if (this.aClass105_3 == null) {
							try {
								local153 = new File(local128, "random.dat");
								if (local79 == 1 || local153.exists()) {
									this.aClass105_3 = new Class105(local153, "rw", 25L);
								}
							} catch (@Pc(171) Exception local171) {
								this.aClass105_3 = null;
							}
						}
						if (this.aFile4 == null) {
							@Pc(227) int local227;
							try {
								local128 = new File(local128, arg1);
								if (local79 == 1 && !local128.exists()) {
									local140 = local128.mkdir();
									if (!local140) {
										continue;
									}
								}
								local153 = new File(local128, "main_file_cache.dat2");
								if (local79 == 0 && !local153.exists()) {
									continue;
								}
								this.aClass105_1 = new Class105(local153, "rw", 104857600L);
								this.aClass105Array1 = new Class105[24];
								for (local227 = 0; local227 < 24; local227++) {
									this.aClass105Array1[local227] = new Class105(new File(local128, "main_file_cache.idx" + local227), "rw", 1048576L);
								}
								this.aClass105_2 = new Class105(new File(local128, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile5 = this.aFile4 = local128;
							} catch (@Pc(277) Exception local277) {
								try {
									this.aClass105_1.method3369();
									for (local227 = 0; local227 < 24; local227++) {
										this.aClass105Array1[local227].method3369();
									}
									this.aClass105_2.method3369();
								} catch (@Pc(304) Exception local304) {
								}
								this.aFile5 = this.aFile4 = null;
								this.aClass105_1 = this.aClass105_2 = null;
								this.aClass105Array1 = null;
							}
						}
					} catch (@Pc(321) Exception local321) {
					}
					if (this.aClass105_3 != null && this.aFile4 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile4 == null) {
			throw new RuntimeException();
		}
	}
}
