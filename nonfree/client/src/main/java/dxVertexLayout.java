import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class304 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "h", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!nca;[Lclient!uq;)V")
	public dxVertexLayout(@OriginalArg(0) Class39_Sub2_Sub1 arg0, @OriginalArg(1) Class287[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aPb1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(21) int local21 = 0;
			@Pc(25) Class287 local25 = arg1[local11];
			for (@Pc(27) int local27 = 0; local25.method7270() > local27; local27++) {
				@Pc(37) Class154 local37 = local25.method7265(local27);
				@Pc(49) byte local49;
				@Pc(47) byte local47;
				@Pc(45) int local45;
				if (local37 == Static241.aClass154_1) {
					local47 = 0;
					local49 = 2;
					local45 = 0;
				} else if (local37 == Static241.aClass154_2) {
					local45 = 0;
					local47 = 3;
					local49 = 2;
				} else if (local37 == Static241.aClass154_3) {
					local47 = 10;
					local49 = 4;
					local45 = 0;
				} else if (Static241.aClass154_4 == local37) {
					local49 = 0;
					local47 = 5;
					local45 = local9++;
				} else if (Static241.aClass154_5 == local37) {
					local45 = local9++;
					local49 = 1;
					local47 = 5;
				} else if (local37 == Static241.aClass154_6) {
					local47 = 5;
					local45 = local9++;
					local49 = 2;
				} else {
					local45 = local9++;
					local49 = 3;
					local47 = 5;
				}
				local7.addElement(local11, local49, 0, local47, local45, local21);
				local21 += local37.anInt4308;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}
