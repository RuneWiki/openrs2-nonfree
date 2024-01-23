import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!f")
public final class Class207 {

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "()V")
	public Class207() throws Exception {
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

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
	private void method4778(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(14) Field local14 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local14.setAccessible(true);
			@Pc(24) boolean local24 = (Boolean) local14.get(this.aGraphicsDevice1);
			if (local24) {
				local14.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(35) Throwable local35) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(64) Field local64 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local64.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(71) Throwable local71) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/awt/Frame;IIIII)V")
	public void method4779(@OriginalArg(0) Frame arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg0.setUndecorated(true);
		arg0.enableInputMethods(false);
		this.method4778(arg0);
		if (arg2 == 0) {
			@Pc(30) int local30 = this.aDisplayMode1.getRefreshRate();
			@Pc(34) DisplayMode[] local34 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < local34.length; local38++) {
				if (local34[local38].getWidth() == arg1 && local34[local38].getHeight() == arg3 && local34[local38].getBitDepth() == arg4) {
					@Pc(66) int local66 = local34[local38].getRefreshRate();
					if (!local36 || Math.abs(local66 - local30) < Math.abs(arg2 - local30)) {
						local36 = true;
						arg2 = local66;
					}
				}
			}
			if (!local36) {
				arg2 = local30;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg1, arg3, arg4, arg2));
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Z)[I")
	public int[] method4780() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(16) int[] local16 = new int[local3.length << 2];
		for (@Pc(18) int local18 = 0; local18 < local3.length; local18++) {
			local16[local18 << 2] = local3[local18].getWidth();
			local16[(local18 << 2) + 1] = local3[local18].getHeight();
			local16[(local18 << 2) + 2] = local3[local18].getBitDepth();
			local16[(local18 << 2) + 3] = local3[local18].getRefreshRate();
		}
		return local16;
	}

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(B)V")
	public void method4781() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method4778(null);
	}
}
