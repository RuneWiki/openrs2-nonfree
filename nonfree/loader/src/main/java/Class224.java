import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!h")
public final class Class224 {

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!h", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "()V")
	public Class224() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(14) GraphicsDevice[] local14 = local3.getScreenDevices();
			for (@Pc(18) int local18 = 0; local18 < local14.length; local18++) {
				@Pc(30) GraphicsDevice local30 = local14[local18];
				if (local30 != null && local30.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local30;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(Z)V")
	public void method5889() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method5892(null);
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(IIIILjava/awt/Frame;I)V")
	public void method5890(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Frame arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg3.setUndecorated(true);
		arg3.enableInputMethods(false);
		this.method5892(arg3);
		if (arg1 == 0) {
			@Pc(31) int local31 = this.aDisplayMode1.getRefreshRate();
			@Pc(35) DisplayMode[] local35 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(37) boolean local37 = false;
			for (@Pc(39) int local39 = 0; local39 < local35.length; local39++) {
				if (local35[local39].getWidth() == arg0 && arg4 == local35[local39].getHeight() && arg2 == local35[local39].getBitDepth()) {
					@Pc(71) int local71 = local35[local39].getRefreshRate();
					if (!local37 || Math.abs(local71 - local31) < Math.abs(arg1 - local31)) {
						arg1 = local71;
						local37 = true;
					}
				}
			}
			if (!local37) {
				arg1 = local31;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg0, arg4, arg2, arg1));
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(B)[I")
	public int[] method5891() {
		@Pc(10) DisplayMode[] local10 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(16) int[] local16 = new int[local10.length << 2];
		for (@Pc(18) int local18 = 0; local18 < local10.length; local18++) {
			local16[local18 << 2] = local10[local18].getWidth();
			local16[(local18 << 2) + 1] = local10[local18].getHeight();
			local16[(local18 << 2) + 2] = local10[local18].getBitDepth();
			local16[(local18 << 2) + 3] = local10[local18].getRefreshRate();
		}
		return local16;
	}

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	private void method5892(@OriginalArg(1) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(10) Field local10 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local10.setAccessible(true);
			@Pc(20) boolean local20 = (Boolean) local10.get(this.aGraphicsDevice1);
			if (local20) {
				local1 = true;
				local10.set(this.aGraphicsDevice1, Boolean.FALSE);
			}
		} catch (@Pc(31) Throwable local31) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(60) Field local60 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local60.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(67) Throwable local67) {
				}
			}
		}
	}
}
